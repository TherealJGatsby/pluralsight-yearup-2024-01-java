import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // variable declaration
        Scanner userInput = new Scanner(System.in);

        String type;
        double add = 0;
        double subtract = 0;
        double multiply = 0;
        double divide = 0;
        double firstNumber;
        double secondNumber;


        // input
        System.out.println("Enter the first number: ");
        firstNumber = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("Enter the second number: ");
        secondNumber = userInput.nextDouble();
        userInput.nextLine();
        System.out.println("Possible calculations: ");
        System.out.println("(A)dd ");
        System.out.println("(S)ubtract ");
        System.out.println("(M)ultiply ");
        System.out.println("(D)ivide ");
        System.out.println("Please select an option: ");
        type = userInput.nextLine();
        System.out.println();




        // work
        switch (type.toLowerCase()) {
            case "a":
                add = firstNumber + secondNumber;
                break;
            case "s":
                subtract = firstNumber - secondNumber;
                break;
            case "m":
                multiply = firstNumber * secondNumber;
                break;
            case "d":
                if (secondNumber != 0) {
                    divide = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }



        // output
        System.out.println("Result:");
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
        if (secondNumber != 0) {
            System.out.println("Division: " + divide);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }


    }
}

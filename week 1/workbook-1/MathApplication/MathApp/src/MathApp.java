public class MathApp {
    public static void main(String[] args) {

        // Question 1: who has the highest salary
        // declare variables here
        double bobSalary = 197589.88;
        double garySalary = 150250.55;

        // then code solution
        double highestSalary = Math.max(bobSalary, garySalary);

        // gives name of person who has the highest salary
        if(garySalary >= bobSalary) {
            System.out.println("Gary has the highest salary at: " + garySalary);
        } else {
            System.out.println("Bob has the highest salary at: " + bobSalary);
        }

        // then use System.out.println() to display results

        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        // Question 2. Find the cheapest price
        // declare variables here
        double carPrice = 45500.99;
        double truckPrice = 95655.50;

        // then code solution
        double cheapestPrice = Math.min(carPrice, truckPrice);

        // then use System.out.println() to display results
        System.out.println("The cheapest price is " + cheapestPrice);

    }
}

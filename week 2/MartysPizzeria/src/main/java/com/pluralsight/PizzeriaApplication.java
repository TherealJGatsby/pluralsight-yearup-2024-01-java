package com.pluralsight;

import com.pluralsight.models.Pizza;
import com.pluralsight.views.UserInput;


import java.util.ArrayList;
import java.util.Scanner;



public class PizzeriaApplication
{

    UserInput ui = new UserInput();

public void run()
{
    ui.displayHomeScreen();
    // get name
    String name = ui.getCustomerName();
    ui.displayBeginOrder();

    // build pizza
    Pizza pizza = new Pizza();
    pizza.setSize(ui.getPizzaSize());
    pizza.setSauce(ui.getSauce());
    pizza.setCheese(ui.getCheese());
    pizza.setToppings(ui.getToppings());

    // display order
    ui.displayOrder(name, pizza);

}


}

package com.sgf.user.headfirst.factorymode;

import java.util.ArrayList;

/**
 * Created by yuers on 2018/11/23.
 */
public abstract class Pizza {
    String name;
    String dough; //面团
    String sauce; //酱，调味料
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce..."+name);
        System.out.println("Adding toppings: ");
        toppings.stream().forEach(t -> System.out.println(t));
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}

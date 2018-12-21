package com.sgf.user.headfirst.factorymode;

/**
 * Created by yuers on 2018/11/26.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore cStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + pizza.getName() + "\n");

        Pizza pizza1 = cStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + pizza1.getName() + "\n");
    }
}

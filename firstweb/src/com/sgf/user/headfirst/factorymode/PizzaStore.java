package com.sgf.user.headfirst.factorymode;

/**
 * Created by yuers on 2018/11/23.
 */
public abstract class PizzaStore {
    /*SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }*/
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = this.createPizza(type);
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

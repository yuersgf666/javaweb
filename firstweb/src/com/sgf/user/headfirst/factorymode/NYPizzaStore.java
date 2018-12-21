package com.sgf.user.headfirst.factorymode;

/**
 * Created by yuers on 2018/11/26.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }
        return null;
    }
}

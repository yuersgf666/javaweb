package com.sgf.user.headfirst.factorymode;

/**
 * Created by yuers on 2018/11/26.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if ("cheese".equals(type)){
            pizza = null;
        }
        return pizza;
    }
}

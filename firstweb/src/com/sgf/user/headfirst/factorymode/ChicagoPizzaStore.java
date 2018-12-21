package com.sgf.user.headfirst.factorymode;

/**
 * Created by yuers on 2018/11/26.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}

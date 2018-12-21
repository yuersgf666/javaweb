package com.sgf.user.headfirst.decoratormodel;

/**
 * Created by yuers on 2018/11/22.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}

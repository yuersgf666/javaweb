package com.sgf.user.headfirst.decoratormodel;

/**
 * Created by yuers on 2018/11/22.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.2;
    }
}

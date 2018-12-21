package com.sgf.user.headfirst.decoratormodel;

/**
 * Created by yuers on 2018/11/22.
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}

package com.sgf.user.headfirst.decoratormodel;

/**
 * Created by yuers on 2018/11/22.
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast";
    }
    @Override
    public double cost() {
        return 1.0;
    }
}

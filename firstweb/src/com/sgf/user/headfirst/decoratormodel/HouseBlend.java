package com.sgf.user.headfirst.decoratormodel;

/**
 * Created by yuers on 2018/11/22.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}

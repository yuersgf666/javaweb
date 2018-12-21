package com.sgf.user.headfirst.strategymode;

/**
 * Created by yuers on 2018/11/19.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }
}

package com.sgf.user.headfirst.strategymode;

/**
 * Created by yuers on 2018/11/19.
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("i fly with sky!");
    }
}

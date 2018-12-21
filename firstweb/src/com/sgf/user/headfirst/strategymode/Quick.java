package com.sgf.user.headfirst.strategymode;

/**
 * Created by yuers on 2018/11/19.
 */
public class Quick implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

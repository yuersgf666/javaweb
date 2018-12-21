package com.sgf.user.headfirst.strategymode;

/**
 * Created by yuers on 2018/11/19.
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i am a model duck!");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quick();
    }
}

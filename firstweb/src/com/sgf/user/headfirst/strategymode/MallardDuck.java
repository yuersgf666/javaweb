
package com.sgf.user.headfirst.strategymode;

/**
 * Created by yuers on 2018/11/19.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quick();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println(" i am a real Mallard Duck!");
    }
}

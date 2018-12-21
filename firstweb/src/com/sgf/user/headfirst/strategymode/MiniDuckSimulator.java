package com.sgf.user.headfirst.strategymode;

/**
 * Created by yuers on 2018/11/19.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck d = new MallardDuck();
//        d.performFly();
//        d.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}

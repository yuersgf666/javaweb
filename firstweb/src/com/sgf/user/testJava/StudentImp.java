package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/12/5.
 */
public class StudentImp implements Student {

    @Override
    public void login() {
        System.out.println("登录");
    }

    @Override
    public void submit() {
        System.out.println("提交");
    }
}

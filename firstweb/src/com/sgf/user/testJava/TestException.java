package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/12/4.
 */
public class TestException extends RuntimeException{

    public TestException(){
        super(new Exception());
        System.out.println("test runtiemExciption!!");
    }
}

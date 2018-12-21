package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/12/4.
 */
public class Exception01 {
    public static void main(String[] args) {
        aa();
    }

    public static void aa(){
        throw new TestException();
    }
}

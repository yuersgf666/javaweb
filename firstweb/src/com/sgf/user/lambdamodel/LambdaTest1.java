package com.sgf.user.lambdamodel;

/**
 * Created by yuers on 2018/11/20.
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        //匿名内部类实现
        /*LambdaUse(new ILambdaTest1(){
            @Override
            public void print(String s){
                System.out.println(s);
            }
        },"hello world!");*/
        LambdaUse(s -> System.out.println(s),"hello world!!");
        LambdaUse(s -> System.out.println(s),"hello world!!");
    }

    public static void LambdaUse(ILambdaTest1 iLambdaTest1,String s){
        iLambdaTest1.print(s);
    }
}

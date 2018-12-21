package com.sgf.user.testJava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yuers on 2018/12/5.
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object targer;

    public MyInvocationHandler(Object targer) {
        this.targer = targer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        method.invoke(targer,args);
        System.out.println("日记记录");
        return null;
    }


}

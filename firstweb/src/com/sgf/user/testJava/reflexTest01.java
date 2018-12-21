package com.sgf.user.testJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by yuers on 2018/12/4.
 */
public class reflexTest01 {
    public static void main(String[] args) {
        aa();
    }

    public static void aa(){
        try {
            Class cls = Class.forName("com.sgf.user.testJava.Person");
            System.out.println( cls.getName());
            Method[] list = cls.getMethods();
            List a = Arrays.asList(list);
            a.stream().forEach(t-> System.out.println(t));
            //System.out.println( cls.getMethods());
            Constructor[] constructors = cls.getConstructors();
            for (Constructor c : constructors) {
                Class[] params = c.getParameterTypes();
                System.out.println(""+params);
                for (Class p:params) {
                    System.out.println(""+p.getName());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void bb(){
        List list = new ArrayList();
    }

}

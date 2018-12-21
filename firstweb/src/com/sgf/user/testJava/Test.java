package com.sgf.user.testJava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yuers on 2018/11/26.
 */
public class Test extends Date {
    public static void main(String[] args) {
        //new Test().test();
        //aa();
        //bb();
        cc();
    }

    public void test(){
        System.out.println(super.getClass().getName());
    }

    public static void aa(){
        StudentImp si = new StudentImp();
        MyInvocationHandler mi = new MyInvocationHandler(si);
        Student s = (Student) Proxy.newProxyInstance(si.getClass().getClassLoader(),si.getClass().getInterfaces(),mi);

        s.login();
        s.submit();
    }

    public static void bb()  {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        Method method = null;
        try {
            method = list.getClass().getMethod("add", Object.class);
            method.invoke(list,"ddd");
        } catch (NoSuchMethodException e) {
            System.out.println("a");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("a");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("a");
            e.printStackTrace();
        }
        System.out.println(list);
    }

    public static void cc(){
        int a = 9/0;
        System.out.println(a);
    }
}

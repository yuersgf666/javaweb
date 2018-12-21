package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/11/28.
 */
public class TestJava01 {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.method();
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer {
    private int num = 10;

    class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner inner = new Inner();
        inner.show();
    }
}

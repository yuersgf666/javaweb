package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/9/11.
 */
public class User<T,U> {
    private T t;
    private U u;
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public <T> void test(T t){
        System.out.println(t.getClass().getName());
    }
}

/*public interface User<T,U>{
    public T getT();
}*/

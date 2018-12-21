package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/11/20.
 */
public class Gzq {

    private String name;
    private int age;
    private double height;

    public Gzq(double d){
        this.height = d;
        age = 18;
        name = "李磊";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "name:"+name+",age: "+age+",height: "+height;
    }
}

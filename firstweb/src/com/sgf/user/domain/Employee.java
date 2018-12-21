package com.sgf.user.domain;

/**
 * Created by yuers on 2018/12/18.
 */
public class Employee {
    private String name;
    private String location;
    private Integer pay;
    private Integer age;

    public Employee(String name, String location, Integer pay, Integer age) {
        this.name = name;
        this.location = location;
        this.pay = pay;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return name+": "+location+" "+pay+" "+age;
    }
}

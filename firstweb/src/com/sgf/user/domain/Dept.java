package com.sgf.user.domain;

import java.util.List;

/**
 * Created by yuers on 2018/12/19.
 */
public class Dept {
    private List<Employee> employees;
    private int number;

    public Dept(List<Employee> employees, int number) {
        this.employees = employees;
        this.number = number;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}

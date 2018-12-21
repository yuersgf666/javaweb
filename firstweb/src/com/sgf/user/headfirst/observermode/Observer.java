package com.sgf.user.headfirst.observermode;

/**
 * Created by yuers on 2018/11/21.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}

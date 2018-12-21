package com.sgf.user.headfirst.observermode;

/**
 * Created by yuers on 2018/11/21.
 */
public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notifyObserver();
}

package com.sgf.user.testJava;

import net.sf.json.JSONObject;

/**
 * Created by yuers on 2018/9/25.
 */
public class JsonTest {
    public static void main(String[] args) {
        aa();
    }

    public static void aa(){
        JSONObject jo = new JSONObject();
        jo.put("name", "zhangSan");
        jo.put("age", "18");
        jo.put("sex", "male");
        System.out.println(jo.toString());
    }
}

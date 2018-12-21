package com.sgf.user.testJava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuers on 2018/9/11.
 */
public class UnitTest {

    @Test
    public void testAdd() {
        Test02 t = new Test02();
        int rs = t.add(1, 5);
        Assert.assertEquals(rs, 6);
    }

    @Test
    public void testSub() {
        Test02 t2 = new Test02();
        int a = t2.sub(99, 999);
        Assert.assertEquals(a, -900);
    }

    @Test
    public void testStrSub() {
        String name = "slajf.asdf.jl.999";
        String uname = name.substring(name.indexOf(".") + 1);
        System.out.println(uname);
    }

    @Test
    public void testJson() {
        List<String> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        StringBuffer sb = new StringBuffer();
        for (String str : list) {
            sb.append("'"+str+"',");
        }

    }
}

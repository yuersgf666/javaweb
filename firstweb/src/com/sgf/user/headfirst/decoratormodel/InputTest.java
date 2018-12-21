package com.sgf.user.headfirst.decoratormodel;

import java.io.*;

/**
 * Created by yuers on 2018/11/23.
 */
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(
                    new BufferedInputStream(new FileInputStream("E:/javaweb/firstweb/src/com/sgf/user/headfirst/decoratormodel/sql.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char) c);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

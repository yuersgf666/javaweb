package com.sgf.user.testJava;

/**
 * Created by yuers on 2018/11/23.
 */
public class JavaSE01 {
    public static void main(String[] args) {
        aa();
    }

    public static void aa(){
        int arr[][] = {{1,2,3},{4,5,6,7},{9}};
        boolean flag = true;
        for (int i=0;i<arr.length && flag;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] == 5){
                    flag = false;
                    break;
                }
                System.out.println(arr[i][j]);
            }
        }
    }
}

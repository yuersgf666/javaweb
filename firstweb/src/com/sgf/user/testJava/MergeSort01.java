package com.sgf.user.testJava;

import java.util.Arrays;

/**
 * Created by yuers on 2018/10/10.
 */
public class MergeSort01 {
    public static void main(String[] args) {
        MergeSort01 m = new MergeSort01();
        /*m.aa("aaaa");
        m.aa(111);
        m.aa(true);*/
        //m.bb();
        //cc();
        //dd();
        ee();
    }

    public void aa(Object obj){
        System.out.println(obj.getClass());
    }

    public void bb(){
        for(int i=0;i<10;i++){
            if(i==2||i==8){
                continue;
            }else {
                System.out.println(i);
            }
            System.out.println("---------"+i);
        }
    }

    public static void cc(){
        String a = "1";
        String b = "1-1";
        String aa[] = a.split("-");
        String bb[] = b.split("-");
        System.out.println(aa[0]);
        //System.out.println("aa type is"+aa.getClass().getName());
        System.out.println(bb[0]);
        /*System.out.println(a.contains("-"));
        System.out.println(b.contains("-"));*/
    }

    public static void dd(){
        int aa[][] = {{1,2,3},{4,5},{9,11,12}};
    }

    public static void ee(){
        ok:
        for (int i=0;i<10;i++){
            System.out.println("i="+i);
            for (int j=0;j<10;j++){
                System.out.println("j="+j);
                if (j==5){
                    System.out.println("OMG is 5");
                    break ok;
                }
            }
        }
    }
}

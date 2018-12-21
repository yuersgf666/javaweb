package com.sgf.user.testJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yuers on 2018/8/27.
 */
public class Test01 {
    public static void main(String[] args) {
        //test01();
        //test02();
        //test03();
        /*int[] a = {3,-2,55,-7,0};
        System.out.print(Arrays.toString(a)+" ");
        aa(a);
        System.out.println(Arrays.toString(a)+" 11");*/
        //cc();
      /*  User user = new User();
        user.test("");
        user.test(0.1);
        user.test("yizhiji");
        user.test(1111);
        user.test(new Object());*/
      /*TestFX tt = new TestFX();
      tt.setT("111");
        System.out.println(tt.getT());
        tt.setT(new Object());
        System.out.println(tt.getT());
        tt.setT(0.01);
        System.out.println(tt.getT());
        System.out.println(tt.getT().getClass().getName());*/
        // dd();
        //ee();
        //ff(2,3,4,5);
        gg();
    }

    public static void test01(){
        for(int i = 0;i<100;i++){
                for(int j=0;j<100;j++){
                    if(j==7){
                        System.out.println("total = "+j);
                        break;
                    }
                 }
            System.out.println("hahahah");
        }
    }

    public static void test02(){
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public static void test03(){
        int i=0;
        int j=0;
        while (j<10){
            while (i<10){
                System.out.println("内"+i);
                if(i==7){
                    break;
                }
                i++;
            }
            System.out.println("外"+j);
            j++;
        }
    }
    //
    public static void aa(int[] arr){
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t;
                    t = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static void bb(String str){
        char[] chars = str.toCharArray();

    }

    public static boolean cc(){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int i = Integer.parseInt(line);
        if(i<=0 || i>Integer.MAX_VALUE){ //2147483647
            System.out.println("非法数字！");//1879048192+268435456+
            return false;
        }
        for(int j=2;j<=i;j++){
           if( i%j ==0 ){
               return true;
           }
        }
        return false;
    }

    public static void dd(){
        List list = new ArrayList();
        list.add("11111");
        list.add(9897676);

        for (int i=0;i<list.size();i++){
            list.get(i);
            System.out.println("test....."+list.get(i));
        }
    }

 /*   public static void ee(){
        A a = new A<String>();
        a.setT(1);
        System.out.println(a.getT().getClass().getName());
    }*/

    public static void ff(int... arr){
        int rs = 0;
        for(int i=0;i<arr.length;i++){
            rs += arr[i];
        }
        System.out.println(rs);
    }

    public static void gg()  {
        Class c1 = "".getClass();
        Class c2 = String.class;
        try {
            Class c3 = Class.forName("java.lang.String");
            System.out.println(c1 != c3);
        }catch (ClassNotFoundException e){
            System.out.println("报错啦");
        }


        System.out.println(c1 == c2);

    }
}

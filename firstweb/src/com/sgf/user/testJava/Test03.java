package com.sgf.user.testJava;

import sun.util.resources.LocaleData;

import javax.xml.bind.Element;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by yuers on 2018/9/20.
 */
public class Test03 {
    public static void main(String[] args) {
        //aa();
        //bb();
        //cc();
        //dd();
        //ee();
        //ff();
//        gg();
//        hh();
        Gzq gzq = new Gzq(98);
        System.out.println(gzq.toString());
    }

    public static void aa(){
        List list = new ArrayList<>();
        list.add("111");
        for(Object o : list){
            System.out.println("====="+o);
        }
        list.clear();
        for(Object o : list){
            System.out.println("====="+o);
            System.out.println("clear");
        }
    }

    public static void bb(){
        Map map = new HashMap<>();
        map.put(1,"A");
        map.put("A",1);
        map.put("B",1);
        map.put("C",1);
    }

    public static void cc(){
        List list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        for (int i=20;i>10;i--){
            list.add(i);
        }
        list.add("A");
        Iterator it = list.iterator();
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void dd(){
        List list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        for (int i=20;i>10;i--){
            list.add(i);
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(list);
        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public static void ee(){
        HashSet hashSet = new HashSet();
        for (int i=0;i<10;i++){
            hashSet.add("a");
            hashSet.add("b");
            hashSet.add("c");
            hashSet.add("d");
            hashSet.add("e");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hashSet);
        System.out.println(Arrays.toString(arrayList.toArray()));
    }

    public static void ff(){
        int count = 0;
        int height = 1;
        while (height<884800){
            height = height * 2;
            count ++;
        }
        System.out.println(count);
    }

    public static void gg(){
        for (int i=1;i<6;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hh(){
        int countDay = 1;
        double money = 2.5;
        while (true){
            countDay++;
            if (countDay == 5 || money % 5 ==0){
                money = money -6;
            }else {
                money += 2.5;
            }
            if (money>=100){
                System.out.println(countDay);
                break;
            }
        }
    }

    public static void ii(){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
    }
}

package com.sgf.user.lambdamodel;

import com.sgf.user.domain.Dept;
import com.sgf.user.domain.Employee;
import com.sgf.user.domain.User;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;
import java.util.stream.Collectors;

/**
 * Created by yuers on 2018/11/20.
 */
public class Test01 {
    public static void main(String[] args) {
        //aa();
        //bb();
        //cc();
        //dd();
        //ee();
//        ff();
        gg();
    }

    public static void aa() {
        List<String> str = Arrays.asList("aa", "bb", "cc");
        /*for (String s : str){
            System.out.println(s);
        }*/

        //str.forEach(s-> System.out.println(s));
        str.forEach(System.out::println);
    }

    public static void bb() {
        List<Double> ds = Arrays.asList(10.0, 110.0, 20.0);
        ds.stream().map(x -> x + x * 0.05).forEach(System.out::println);
        double all = ds.stream().map(x -> x + x * 0.05).reduce((sum, x) -> sum + x).get();
        System.out.println(all);
    }

    public static void cc() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        cost.stream().filter(s -> s > 25.0).collect(Collectors.toList()).
                forEach(System.out::println);

    }

    public static void dd() {
        String[][] str = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9", "10"}};
        Arrays.stream(str).forEach(t -> Arrays.stream(t)
                .forEach(f -> System.out.print(f + ",")));
        Arrays.stream(str).forEach(t -> Arrays.stream(t).filter(f -> f.length() > 0).forEach(f -> System.out.println(f)));
    }

    public static void ee() {
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setPassword("userpw" + i);
            user.setUsername("userun" + i);
            user.setVerifyCode("uservc" + i);
            user.setAccount(i);
            list.add(user);
        }
        for (int i = 0; i < 10; i++, i++) {
            User user = new User();
            user.setPassword("userpw" + i);
            user.setUsername("userun" + i);
            user.setVerifyCode("uservc" + i);
            list.add(user);
        }
        //Map<String, Long> map = list.stream().filter(t -> t.getUsername().equals("userun5")).collect(Collectors.groupingBy(t -> t.getUsername(), Collectors.counting()));
        //list.stream().collect(Collectors.groupingBy(t -> t.getUsername(), Collectors.counting()));
        //System.out.println(list.toString());
        Comparator<User> counting = Comparator.comparing(User::getAccount);
        System.out.println(counting.toString());
        //list.stream().max((a, b) -> a.getAccount().compareTo(b.getAccount()));
        Integer max = list.stream().filter(t -> t.getAccount() != null).max(Comparator.comparing(User::getAccount)).get().getAccount();
        System.out.println(max);
        //Integer max = list.stream().max(Comparator.comparing(User::getAccount)).get().getAccount();
        //System.out.println(map.toString());
        //System.out.println("max: " + max);
        //System.out.println(max);
    }

    public static void ff() {
        String[] plants = new String[]{"x", "eeeee", "a", "bb", "ccc", "dddd"};
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        Arrays.sort(plants, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(plants));
    }

    public static void gg() {
        List<Employee> list = Arrays.asList(
                new Employee("张三", "上海", 5000, 22),
                new Employee("李四", "北京", 4000, 23),
                new Employee("李四", "北京", 4000, 23),
                new Employee("李四", "香港", 7000, 50),
                new Employee("赵六", "纽约", 1000, 8)
        );
        List<Dept> depts = Arrays.asList(
                new Dept(list, 1),
                new Dept(list, 2),
                new Dept(list, 3)
        );
        /*Integer max = list.stream().max(Comparator.comparing(Employee::getPay)).get().getAge();
        System.out.println(max);
        //list.sort(Comparator.comparing(Employee::getPay));
        list.sort((a,b)->b.getPay()-a.getPay());
        System.out.println(list.toString());
        list.sort(Comparator.comparing(Employee::getAge));
        System.out.println(list.toString());
        List a = list.stream().limit(3).collect(Collectors.toList());
        list.stream().map(x-> x.getAge());
        System.out.println(a.toString());*/
//        list.stream().map(t -> t.getPay() + 10).limit(5).forEach(t -> System.out.println(t.toString()));
//        list.stream().forEach(t->t.setPay(10));
        /*depts.stream().forEach(t -> {
            t.getEmployees().stream().forEach(x -> System.out.println(x.toString()));
        });*/
        boolean b = list.stream().allMatch(t->"李四".equals(t.getName()));
        boolean c = list.stream().anyMatch(t->"李四".equals(t.getName()));
        Map<String,List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(map);
        System.out.println(b);
        System.out.println(c);
        List a = list.stream().distinct().collect(Collectors.toList());
        System.out.println(a);
    }
}

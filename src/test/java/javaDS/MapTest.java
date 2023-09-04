package javaDS;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //HashMap 无序
//        Map<Integer,String> map = new HashMap<>();
//        map.put(2,"文");
//        map.put(1,"罗");
//        map.put(3,"洒");
//        map.put(4,null);
//        System.out.println("map = " + map);
        //LinkedHashMap 有序
//        Map<Integer,String> map = new LinkedHashMap<>();
//        map.put(2,"文");
//        map.put(1,"罗");
//        map.put(3,"洒");
//        map.put(4,null);
//        System.out.println("map = " + map);
        //TreeMap 会自动排序
//        Map<Integer,String> map = new TreeMap<>();
//        map.put(2,"文");
//        map.put(1,"罗");
//        map.put(3,"洒");
//        map.put(4,null);
//        System.out.println("map = " + map);
        //Hashtable E不可null,无序,是线程安全的
        Map<Integer,String> map = new Hashtable<>();
        map.put(2,"文");
        map.put(1,"罗");
        map.put(3,"洒");
        //map.put(4,null);
        System.out.println("map = " + map);
    }
}

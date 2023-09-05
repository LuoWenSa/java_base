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
//        Map<Integer,String> map = new Hashtable<>();
//        map.put(2,"文");
//        map.put(1,"罗");
//        map.put(3,"洒");

        Map<Integer,String> map = new HashMap<>();
        map.put(2,"文");
        map.put(1,"罗");
        map.put(3,"洒");
        //迭代器：iterator
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            //System.out.println("Key = " + iterator.next().getKey() + " Value = " + iterator.next().getValue()); //iterator.next()始终指向下一个元素
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }
//        //遍历key
//        for (Integer integer : map.keySet()) {
//            System.out.println("key = " + integer);
//        }
//        //遍历value
//        for (String value : map.values()) {
//            System.out.println("value = " + value);
//        }
    }
}

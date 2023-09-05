package javaDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        Integer[] a = {1,2,3,4,5,6,7,8,9};
        List<Integer> intList = new ArrayList<>(Arrays.asList(a));

        //迭代器删除元素
//        Iterator<Integer> iterator = intList.iterator();
//        while (iterator.hasNext()){
//            if(iterator.next() % 2 == 0){
//                iterator.remove();
//            }
//        }
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i) % 2 == 0){
                intList.remove(i);
            }
        }
        System.out.println("intList = " + intList);
    }
}

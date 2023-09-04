package javaDS;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        //hashSet 无序，E可null
//        Set<Integer> numberSet = new HashSet<>();
//        numberSet.add(1);
//        numberSet.add(3);
//        numberSet.add(3);
//        numberSet.add(2);
//        numberSet.add(null);
//        System.out.println("numberSet = " + numberSet);

        //LinkedHashSet 有序，E可null
        Set<Integer> numberSet = new LinkedHashSet<>();
        numberSet.add(1);
        numberSet.add(3);
        numberSet.add(3);
        numberSet.add(2);
        numberSet.add(null);
        System.out.println("numberSet = " + numberSet);

        //TreeSet 会自动排序，E不可null
//        Set<Integer> numberSet = new TreeSet<>();
//        numberSet.add(1);
//        numberSet.add(3);
//        numberSet.add(3);
//        numberSet.add(2);
//        //numberSet.add(null);
//        System.out.println("numberSet = " + numberSet);
    }


}

package javaDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //ArrayList 优：查，劣：增删改
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(2);
//        numberList.add(2);
//        System.out.println("numberList = " + numberList);
        //LinkedList 优：增删改，劣：查
        List<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(null);
        System.out.println("numberList = " + numberList);

    }
}

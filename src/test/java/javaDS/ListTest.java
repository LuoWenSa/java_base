package javaDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //ArrayList 有序，优：查，劣：增删
//        List<Integer> numberList = new ArrayList<>();
//        numberList.add(2);
//        numberList.add(2);
//        System.out.println("numberList = " + numberList);
        //LinkedList 有序，优：增删，劣：查
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(null);
        System.out.println("numberList = " + numberList);
//        LinkedList<Integer> numberCloneList  = (LinkedList<Integer>) numberList.clone();
//        System.out.println("numberCloneList = " + numberCloneList);
    }
}

package javaAdvanced;

import study.dto.Chimpanzee;
import study.dto.GenericDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 泛型
 * @author: Ray
 * @date: 2023年09月06日 10:10
 */
public class genericsText {
    public static void main(String[] args) {
        //使用泛型方法打印不同类型的数组元素
//        Integer[] a = {1,2,3,4};
//        Character[] b = {'l','w','s'};
//        System.out.println("数字-printArray：");
//        printArray(a);
//        System.out.println("字符-printArray：");
//        printArray(b);
        //只接收实现了Comparable接口的类，及其子类
//        Integer a  = 4, b = 7;
//        System.out.println("max(a,b) = " + max(a, b));
        //判断Number子类的类型
//        Integer a = 3;
//        Double b = 4.56d;
//        System.out.println("checkNumber:" + checkNumber(a));
//        System.out.println("checkNumber:" + checkNumber(b));
        //泛型类
//        GenericDto<Integer> g1 = new GenericDto<>();
//        g1.set(73);
//        GenericDto<String> g2 = new GenericDto<>();
//        g2.set("lws");
//        System.out.println("g1.get() = " + g1.get());
//        System.out.println("g2.get() = " + g2.get());

        List<String> stringList = new ArrayList<>();
        stringList.add("罗文洒");
        stringList.add("AMAZING");
        List<Double> charList = new ArrayList<>();
        charList.add(1.2);
        charList.add(1.4);
        charList.add(1.7);
        List<Integer> numberList = new ArrayList<>();
        numberList.add(37);
        numberList.add(73);

        //printList(stringList);
        printList(charList);
        printList(numberList);

    }

    /**
     * 使用泛型方法打印不同类型的数组元素
     * @param array
     * @param <E>
     */
    public static <E> void printArray(E[] array){
        for (E e : array) {
            System.out.println("e = " + e);
        }
    }

    /**
     * 要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界。
     * @param x
     * @param y
     * @return
     * @param <N>
     */
    public static <N extends Comparable<N>> N max(N x, N y) {
        if (x.compareTo(y) > 0) {
            return x;
        } else {
            return y;
        }
    }

    /**
     * 判断Number子类的类型
     * @param x
     * @return
     * @param <T>
     */
    public static <T extends Number> String checkNumber(T x){
        if(x instanceof Integer){
            return "this is Integer";
        }else if(x instanceof Double){
            return "this is Double";
        }else{
            return "none of your business";
        }
    }

    public static <T extends Number> void printList(List<T> list){
        int i = 1;
        for (T t : list) {
            System.out.println("item"+ i +" = " + t);
            i++;
        }
    }

}

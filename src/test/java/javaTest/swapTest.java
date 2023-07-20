package javaTest;

import java.util.ArrayList;
import java.util.List;

public class swapTest {
    public static void main(String[] args) {
        //参数传递
        Integer a = 10, b = 20;
        swap(a,b);// 调用swap方法
        System.out.println("a = " + a + ", b = " + b); // 输出a和b的值

        //引用传递
        List<Integer> c = new ArrayList<>();
        changTest(c);
        System.out.println("main:" + c);

    }

    private static void swap(Integer a, Integer b){
            Integer temp = a;
            a = b;
            b = temp;
    }

    private static void changTest(List<Integer> src){
        System.out.println("changeTest before:" + src);
        src.add(653);
        System.out.println("changeTest after:" + src);
    }

}

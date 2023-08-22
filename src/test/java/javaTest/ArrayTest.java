package javaTest;

import java.util.Arrays;

/**
 * @author: Ray
 * @date: 2023年08月22日 12:00
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] x = {1,3,5,7};
        //1.正序排序
        Arrays.sort(x);
        System.out.println("x = " + Arrays.toString(x));
        //2.有序数组的二分查找
        System.out.println("Arrays.binarySearch(x,7) = " + Arrays.binarySearch(x, 7));
        //3.给数组赋值
        Arrays.fill(x,4);
        System.out.println("x = " + Arrays.toString(x));
    }
}

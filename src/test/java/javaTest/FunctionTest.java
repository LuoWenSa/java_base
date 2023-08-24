package javaTest;

import study.dto.Dog;

public class FunctionTest {
    public static void main(String[] args) {
//        int[] brr = {1,3,5,7};
//        print(2,4,6,8,10);
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        d2 = null;
        d3 = null;
        System.gc();
    }

    public static void print(int...arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

}


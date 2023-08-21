package javaTest;

import java.util.Random;

/**
 * @author: Ray
 * @date: 2023年08月21日 9:30
 */
public class MathTest {
    public static void main(String[] args) {
        double x = 3.6;
        double z = 3.5;
        double y = 3.4;
        System.out.println("Math.ceil(x) = " + Math.ceil(x));
        System.out.println("Math.ceil(z) = " + Math.ceil(z));
        System.out.println("Math.ceil(y) = " + Math.ceil(y));  //向上取整 ans：4

        System.out.println("Math.floor(x) = " + Math.floor(x));
        System.out.println("Math.floor(z) = " + Math.floor(z));
        System.out.println("Math.floor(y) = " + Math.floor(y));  //向下取整 ans：3

        System.out.println("Math.round(x) = " + Math.round(x));
        System.out.println("Math.round(z) = " + Math.round(z));
        System.out.println("Math.round(y) = " + Math.round(y));  //四舍五入 alg：Math.floor(x+0.5)

        System.out.println("Math.random() = " + Math.random());  //返回值:double 范围:[0.0,1.0)

        //etc
        System.out.println("new Random().nextInt(10) = " + new Random().nextInt(10));  //0~9
    }
}

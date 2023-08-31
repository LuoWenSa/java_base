package javaTest;

import study.enums.Color;
import study.enums.Ecolor;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        Ecolor c = Ecolor.GREEN;
        System.out.println("Enum color = " + c);
//        //枚举类内部实现
//        Color nc = Color.GREEN;
//        System.out.println("Native Enum color = " + nc);
        Ecolor[] ecolors = Ecolor.values();
        System.out.println("ecolors = " + Arrays.toString(ecolors));
//        switch默认case自动带出枚举类的值
//        switch(c) {
//            case RED:
//                System.out.println("红色");
//                break;
//            case GREEN:
//                System.out.println("绿色");
//                break;
//            case YELLOW:
//                System.out.println("蓝色");
//                break;
//        }

        System.out.println("c.ordinal() = " + c.ordinal());
        System.out.println("Enum.valueOf() = " + Ecolor.valueOf("GREEN"));

    }

}

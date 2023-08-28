package javaTest;

import java.util.Scanner;

/**
 * @author: Ray
 * @date: 2023年08月28日 9:48
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入一个字符串 nextLine():");
        String str1 = s.nextLine();
        System.out.println("str1 = " + str1);

        System.out.println("请输入一个字符串 next():");
        String str2 = s.next();
        System.out.println("str2 = " + str2);

    }
}

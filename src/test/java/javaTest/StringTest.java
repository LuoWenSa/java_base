package javaTest;

/**
 * @author: Ray
 * @date: 2023年08月21日 11:38
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello world";  //放入字符串池
        String s = new String("hello world");  //放入堆中
        System.out.println("s == s1 = " + s == s1);
        System.out.println("s.equals(s1) = " + s.equals(s1));

//        在运行时将字符串添加到内部的字符串池中，并返回字符串池中的引用
//        String cls = s.intern();

        String s2 = "wor";
        System.out.println(s1.substring(6, 9));

        //取右边三位
        String s3 = "SCJH20230808002003";
        System.out.println("s3.substring(s3.length()-3) = " + s3.substring(s3.length() - 3));
    }
}

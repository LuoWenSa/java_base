package javaTest;

import java.io.*;
import java.util.Objects;

public class IoTest {
    public static void main(String[] args) {
//        //从控制台读取多字符输入：
//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            System.out.println("输入字符，按下'q'键退出");
//            //读取字符
//            do {
//                c = (char) br.read();
//                System.out.println(c);
//            }while (c != 'q');
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //从控制台读取字符串：
//        String str;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            System.out.println("输入字符，按下\"end\"键退出");
//            //读取字符串
//            do {
//                str = br.readLine();
//                System.out.println(str);
//            }while (!"end".equals(str));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //控制台输出单个字符：
//        System.out.write('A');
//        System.out.write('\n');

        //FileInputStream
//        try {
//            InputStream inputStream = new FileInputStream("F:/666/inDemo.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        //FileOutputStream
//        try {
//            OutputStream outputStream = new FileOutputStream(new File("F:/666/outDemo.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //InputStream 和 OutputStream例子
        byte[] bWrite = {11, 21, 3, 40, 5};
        try {
            //把给定的数字以二进制形式写进该文件
            OutputStream os = new FileOutputStream("E:/666/outDemo.txt");
            for (int i = 0; i < bWrite.length; i++) {
                os.write(bWrite[i]);
            }
            os.close();

            //读文件到InputStream
            InputStream is = new FileInputStream("E:/666/outDemo.txt");
            int size = is.available();

            //把读到的文件一个字符一个字符地打印到控制台
            for(int i = 0; i < size; i++){
                System.out.print((char) is.read()+" ");
            }
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

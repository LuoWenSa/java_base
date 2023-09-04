package javaDS;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Java Properties 类
 * @author: Ray
 * @date: 2023年09月04日 13:06
 */
public class PropertiesTest {
    public static void main(String[] args) {
        Properties prop = new Properties();

        File file = new File("E:\\666\\info.txt");

        //FileInputStream fileInputStream = new FileInputStream(file) //用字节流读取
        //InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8) //用字符流读取

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            // 为什么23行下面写FileOutputStream fileOutputStream =new FileOutputStream(file);会置空E:\666\info.txt文件的内容，
            // 但是为什么prop.load(inputStreamReader);会变化，难道IO流是动态的？源码我看不出来
            //读配置文件
            prop.load(inputStreamReader);
            System.out.println("username = " + prop.getProperty("username"));
            fileInputStream.close();
            inputStreamReader.close();
            //操作改变properties类
            prop.setProperty("username","罗文飒");
            System.out.println("username after set = " + prop.getProperty("username"));
            //写入配置文件
            FileOutputStream fileOutputStream =new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            prop.store(outputStreamWriter,null);
            fileOutputStream.close();
            outputStreamWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

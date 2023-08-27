package javaTest;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileIoTest {

    public static void main(String[] args) {
        try {
            File file = new File("F:/666/outDemo.txt");

            FileOutputStream fop = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
            //写入缓冲区
            writer.append("中文输入");
            //换行 \r回车是将光标移到一行的前面,\n是移到下一行
            writer.append("\r\n");
            writer.append("English");
            //关闭写入流，同时会把缓冲区内容写入文件
            writer.close();
            //关闭输出流，释放系统资源
            fop.close();

            FileInputStream fip = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fip,StandardCharsets.UTF_8);
            StringBuffer sb = new StringBuffer();
            while (reader.ready()){
                sb.append((char) reader.read());
            }

            System.out.println(sb);
            //关闭读取流
            reader.close();
            //关闭输入流,释放系统资源
            fip.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

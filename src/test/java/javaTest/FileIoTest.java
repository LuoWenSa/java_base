package javaTest;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

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

    @Test
    //标准的文件批量读写
    public void normalBatchFileIOTest(){
        File sourceFile = new File("E:\\demo\\source.txt");
        File targetFile = new File("E:\\demo\\target.txt");
        try {
            //获取输入流
            FileInputStream in = new FileInputStream(sourceFile);
            //批量读取
            int len = 0;
            byte[] buffer = new byte[1024]; //1024B = 1KB
            FileOutputStream out = new FileOutputStream(targetFile);
            while ((len = in.read(buffer)) > 0) { //每次读取1KB
//                System.out.println("len = " + len);
//                System.out.println("in.available() = " + in.available());
//                System.out.println("buffer = " + Arrays.toString(buffer));
//                System.out.println("buffer.length() = " + len);
                out.write(buffer,0,len);
            }
            //关闭资源
            out.close();
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

package javaTest;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;

public class DirTest {
    public static void main(String[] args) {
        //创建文件夹
//        File file = new File("F:/666/555");
//        boolean mkdirFlag = file.mkdir();
//        System.out.println("mkdirFlag = " + mkdirFlag);
        //判断是否为目录
        String dirname = "F:/666";
//        File f1 = new File(dirname);
//        if (f1.isDirectory()) {
//            System.out.println("目录 " + dirname);
//            String[] s = f1.list();
//            for (int i = 0; i < s.length; i++) {
//                File f = new File(dirname + "/" + s[i]);
//                if (f.isDirectory()) {
//                    System.out.println(s[i] + " 是一个目录");
//                } else {
//                    System.out.println(s[i] + " 是一个文件");
//                }
//            }
//        } else {
//            System.out.println(dirname + " 不是一个目录");
//        }
        //删除目录或文件
        File folder = new File(dirname);
        File[] files = folder.listFiles();
        if(files != null && files.length != 0){
            for (File f : files) {
                if(f.isDirectory()){
                    System.out.println("f.delete() = " + f.delete());
                }
            }
        }
        //System.out.println("Arrays.stream(files).toArray() = " + Arrays.toString(Arrays.stream(files).toArray()));
    }
}

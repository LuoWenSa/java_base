package javaTest;

import study.dto.Chimpanzee;
import study.dto.Gorilla;
import study.interfaces.TagInterface;

public class InterfaceTest {
    public static void main(String[] args) {
//        //接口中的变量 public static final
//        System.out.println("B.finalX = " + B.finalX);
//        //接口中的静态方法
//        B.staticFunction();

//        Chimpanzee chimpanzee = new Chimpanzee();
//        chimpanzee.defaultFunction();
        TagInterface tag = new Gorilla();

    }
}

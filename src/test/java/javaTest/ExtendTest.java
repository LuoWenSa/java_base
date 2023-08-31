package javaTest;

import study.dto.Animal;
import study.dto.Dog;
import study.dto.Gorilla;

public class ExtendTest {
    public static void main(String[] args) {
        //子类调用父类的构造方法给父类的成员变量赋值
//        Dog dog = new Dog("24","15");
//        System.out.println("dog.aniId = " + dog.aniId);
//        System.out.println("dog.aniPId = " + dog.aniPId);
        Gorilla gorilla = new Gorilla("小黑");
    }
}

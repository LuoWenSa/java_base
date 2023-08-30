package javaTest;

import study.abstracts.AbstractClass;
import study.dto.Cat;

public class abstractTest {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
        protected void sbFuction() {
                System.out.println("sb");
            }
        };

        abstractClass.fuction();
        //1.抽象类可以被实例化，且实例化的对象只能调用普通方法

        Cat c = new Cat();
        c.useProtectedFunction();



    }
}

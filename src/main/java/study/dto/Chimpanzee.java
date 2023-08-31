package study.dto;

import study.interfaces.B;

public class Chimpanzee implements B {
    public Chimpanzee(){
        System.out.println("Chimpanzee的无参构造方法");
    }

    @Override
    public void show() {
        System.out.println("Chimpanzee.show()");
    }
}

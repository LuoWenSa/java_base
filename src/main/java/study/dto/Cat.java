package study.dto;

import study.abstracts.AbstractClass;

public class Cat extends AbstractClass {
    @Override
    protected void sbFuction() {
        System.out.println("猫继承的抽象类的保护方法");
    }

    protected void protectedFuction() {
        System.out.println("猫的普通的保护方法");
    }

    public void useProtectedFunction(){
        this.sbFuction();
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sbFuction();
    }
}

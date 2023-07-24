package study.dto;

public class Cat extends AbstractClass{
    @Override
    protected void sbFuction() {
        System.out.println("猫继承的抽象类的保护方法");
    }

    public void useProtectedFunction(){
        this.sbFuction();
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sbFuction();
    }
}

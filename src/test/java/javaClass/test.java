package javaClass;

import study.dto.AbstractClass;
import study.dto.Animal;
import study.dto.Cat;
import study.dto.Dog;


/**
 * @author: Ray
 * @date: 2023年07月03日 16:06
 */
public class test {
    public static void main(String[] args) {
        //Animal a =  new Animal();

        //类中静态变量和动态变量的区别
        Dog dog3 = new Dog();
        dog3.setAge1np(7);
        System.out.println("dog1的age1np:"+dog3.getAge1np());
        Dog dog4 = new Dog();
        dog4.setAge1np(8);
        System.out.println("dog2的age1np:"+dog3.getAge1np());

        Dog dog1 = new Dog();
        dog1.setAge(2);
        Dog dog2 = new Dog();
        System.out.println("dog1的age:"+dog1.getAge());
        System.out.println("dog2的age:"+dog2.getAge());

        //可以通过类名调用静态方法 ,不能通过new对象的方式访问
        Dog.staticMethod();

        //Cat c = new Cat();
        //子类被父类引用，如果子类重写实现了父类的方法，则父类引用是用的子类重写的方法
        Animal animal = new Dog();
        animal.eat();
        animal.speak();

        //todo java 继承 父类 protected 方法
    }

}

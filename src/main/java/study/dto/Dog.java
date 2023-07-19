package study.dto;

import lombok.*;

import java.util.Date;

/**
 * @author: Ray
 * @date: 2023年06月30日 16:58
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal{

    Integer age;
    String name;
    Date birthday;

    //final修饰
    final static double PI = 3.1415;

    //类变量
    public static Integer age1;
    static Integer age1np;

    public Integer getAge1np() {
        return age1np;
    }

    public void setAge1np(Integer age1np) {
        Dog.age1np = age1np;
    }

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void housekeeping(){
        System.out.println("我会看家");
    }
//
//    //匿名内部类
//    public static class AnonymousInnerDog{
//        public static void main(String[] args) {
//            Dog dog = new Dog(){
//                @Override
//                public void housekeeping() {
//                    System.out.println("我会匿名看家");
//                }
//            };
//            dog.housekeeping();
//        }
//    }

}

package study.dto;

import lombok.*;

import java.util.Date;

/**
 * @author: Ray
 * @date: 2023年06月30日 16:58
 */

@Getter
@Setter
public class Dog extends Animal{

    Integer age;
    String name;
    Date birthday;

    //final修饰
    static final double PI = 3.1415;

    //类变量
    public static Integer age1;
    static Integer age1np;

    public Dog(){

    }
    public Dog(String aniId, String aniPId){
        aniId = aniId;
        aniPId = aniPId;
    }

    public Integer getAge1np() {
        return age1np;
    }

    public void setAge1np(Integer age1np) {
        Dog.age1np = age1np;
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("小狗在吃骨头");
    }

    public void housekeeping(){
        System.out.println("我会看家");
    }

    public static void staticMethod(){
        System.out.println("这是静态方法");
    }

    protected void protectedFuction() {
        System.out.println("狗的普通的保护方法");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用finalize方法");
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

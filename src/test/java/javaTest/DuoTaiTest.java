package javaTest;

import study.dto.Animal;
import study.dto.Dog;
import study.dto.Gorilla;

public class DuoTaiTest {
    public static void main(String[] args) {
        show(new Dog());
        show(new Gorilla());
    }

    static void show(Animal a){
        // 类型判断
        if(a instanceof Dog){
            a.eat();
        }else if(a instanceof Gorilla){
            a.eat();
        }
    }

}

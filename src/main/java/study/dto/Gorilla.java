package study.dto;

import lombok.Getter;
import lombok.Setter;
import study.interfaces.TagInterface;

@Getter
@Setter
public class Gorilla extends Animal implements TagInterface {
    private Integer age;
    private String name;
    public Gorilla(){
        System.out.println("Gorilla的无参构造方法");
    }

    public Gorilla(String name){
        System.out.println("Gorilla的有参构造方法");
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("猩猩在吃香蕉");
    }
}

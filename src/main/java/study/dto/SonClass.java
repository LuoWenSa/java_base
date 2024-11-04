package study.dto;

public class SonClass extends FatherClass{


    static {
        System.out.println("SonClass的静态代码块");
    }
    public SonClass(){
        System.out.println("SonClass的无参构造方法");
    }

    public SonClass(int age){
        super(age);
        System.out.println("SonClass的有参构造方法");
    }

}

package study.dto;

public class SonClass extends FatherClass{


    static {
        System.out.println("SonClass的静态代码块");
    }
    public SonClass(){
        System.out.println("SonClass的无参构造方法");
    }

}

package study.dto;

public class FatherClass {
    static {
        System.out.println("FatherClass的静态代码块");
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public FatherClass(){
        System.out.println("FatherClass的无参构造方法");
    }

    public FatherClass(int age){
        System.out.println("FatherClass的有参构造方法");
        this.age = age;
    }

    public static void fatherStaticMethod(){
        System.out.println("FatherClass的静态方法");
    }
}

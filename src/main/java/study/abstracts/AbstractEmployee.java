package study.abstracts;

import study.interfaces.A;

/**
 * @author: Ray
 * @date: 2023年08月30日 11:04
 */
public abstract class AbstractEmployee {
    //成员变量
    private String name;
    String defaultName;
    protected String protectedName;
    public String publicName;

    private String address;
    private int number;

    //构造方法
//    public AbstractEmployee(String name, String address, int number)
//    {
//        System.out.println("Constructing an Employee");
//        this.name = name;
//        this.address = address;
//        this.number = number;
//    }
    //成员方法
    public String toString() {
        return name + " " + address + " " + number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

     void defaultMailCheck() {
        System.out.println("defaultMailCheck");
     }

     public abstract void abstractMailCheck();

}

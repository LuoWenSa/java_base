package study.dto;

/**
 * @author: Ray
 * @date: 2023年07月24日 10:53
 */
public abstract class AbstractClass {
    private String pName;
    public String name;

    public void fuction(){
        System.out.println("使用抽象类中的普通方法");
    }

    //抽象类中的方法不能用private修饰
    protected abstract void sbFuction();

}

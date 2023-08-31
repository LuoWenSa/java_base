package study.enums;

public enum Ecolor{
    RED, GREEN, YELLOW;

    public String name;
    public static String staticName;

    // 构造函数
    private Ecolor(){
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo(){
        System.out.println("Universal Color");
    }

}

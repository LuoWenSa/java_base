package study.interfaces;

public abstract interface B {
    String x = "2";
    final String finalX = "22";
    static String staticX = "222";

    default void defaultFunction(){  //实现了B接口的类可以直接调用
        System.out.println("接口中的默认方法");
    }

    static void staticFunction(){
        System.out.println("接口中的静态方法");
    }

    void show();
}

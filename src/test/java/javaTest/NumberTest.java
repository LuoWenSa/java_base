package javaTest;

public class NumberTest {
    public static void main(String[] args) {
        Integer a = 10;
//        System.out.println("a.byteValue() = " + a.intValue());
        Double aDouble = Double.valueOf(a);
        System.out.println("a = " + a.toString());

        aDouble.toString();
        Double.parseDouble("12.3");

    }
}

package javaTest;

/**
 * @author: Ray
 * @date: 2023年08月22日 11:16
 */
public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("https://www.runoob.com/wp-content/uploads/2013/12/java-string-20201208.png");

        System.out.println("stringBuilder.substring(0, 5) = " + stringBuilder.substring(0, 5)); //和string类型的substring规则一样

    }
}

package javaTest;

/**
 * @author: Ray
 * @date: 2023年08月21日 11:20
 */
public class CharacterTest {
    public static void main(String[] args) {
        Character num = '1';
        Character zfSmall = 'a';
        Character zfBig = 'a';
        Character space = ' ';

        System.out.println("Character.isDigit() = " + Character.isDigit(num));  //是否是一个数字字符
        System.out.println("Character.isLetter() = " + Character.isLetter(zfSmall));  //是否是一个字母字符
        System.out.println("Character.toUpperCase() = " + Character.toUpperCase(zfSmall)); //小写字符转大写字符 a --> A
        System.out.println("Character.toLowerCase() = " + Character.toLowerCase(zfBig)); //大写字符转小写字符 A --> a
        System.out.println("Character.isWhitespace() = " + Character.isWhitespace(space)); //是否是一个空白字符
    }
}

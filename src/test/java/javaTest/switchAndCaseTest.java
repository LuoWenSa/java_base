package javaTest;

/**
 * @author: Ray
 * @date: 2023年08月04日 17:11
 */
public class switchAndCaseTest {
    public static void main(String[] args) {
        String grade = "B";
        switch (grade){
            case "A":
                System.out.println("优秀");
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("合格");
            case "F":
                System.out.println("不合格");
            default:
                System.out.println("default");
        }
    }
}

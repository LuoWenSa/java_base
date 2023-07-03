package study.dto;

/**
 * @author: Ray
 * @date: 2023年06月30日 16:55
 */
public class Animal {
    public void speak(){
        System.out.println("I am animal!");
    }
    public void eat(){
        System.out.println("I am eating!");
    }
    private void eatp(){
        System.out.println("I am private eating!");
    }
    protected void eatp1(){
        System.out.println("I am protected eating!");
    }
}

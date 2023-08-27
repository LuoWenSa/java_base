package study.dto;

import lombok.Data;

/**
 * @author: Ray
 * @date: 2023年06月30日 16:55
 */
public class Animal {

    public String aniId;

    public void speak(){
        System.out.println("say：I am animal!");
    }
    public void eat(){
        System.out.println("I am public eating!");
    }

    //测试public
    public void eatPublic(){
        System.out.println("I am public eating!");
    }

    //测试private
    private void eatp(){
        System.out.println("I am private eating!");
    }

    //测试protected
    protected void eatp1(){
        System.out.println("I am protected eating!");
    }

    //测试默认void(default)
    void eatp2(){
        System.out.println("I am default eating!");
    }

}

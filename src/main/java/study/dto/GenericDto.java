package study.dto;

/**
 * 泛型类
 * @author: Ray
 * @date: 2023年09月06日 15:24
 */
public class GenericDto<T>{
    private T x;

    public void set(T x){
        this.x = x;
    }

    public T get(){
        return this.x;
    }
}

package javaAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream流 java8
 * @author: Ray
 * @date: 2023年09月07日 11:56
 */
public class streamTest {
    public static void main(String[] args) {
        //创建字符串List
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "bc");
        //创建数字List
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        //统计字符串List中非空字符串数量
        System.out.println("stream count() = " + strings.stream().filter(String -> !String.isEmpty()).count());
        //字符串List过滤空字符串
        System.out.println("stream List() isNotEmpty = " + strings.stream().filter(String -> !String.isEmpty()).collect(Collectors.toList()));
        //字符串List各元素按，拼接
        System.out.println("stream List() join = " + strings.stream().filter(String -> !String.isEmpty()).collect(Collectors.joining(",")));
        //字符串List去重
        System.out.println("stream distinct = " + strings.stream().distinct().collect(Collectors.toList()));
        //forEach输出
        numbers.stream().limit(3).forEach(System.out::println);
        //用 map 输出了元素对应的平方数,倒序输出
        System.out.println("numbers stream 平方 = " + numbers.stream().map(i -> i * i).distinct().sorted((x,y)->y-x).collect(Collectors.toList()));
        //用mapToInt做数值操作
        System.out.println("numbers.stream().mapToInt(x -> x).sum() = " + numbers.stream().mapToInt(x -> x).sum());
        System.out.println("numbers.stream().mapToInt(x -> x).max() = " + numbers.stream().mapToInt(x -> x).max().getAsInt());
        System.out.println("numbers.stream().mapToInt(x -> x).min() = " + numbers.stream().mapToInt(x -> x).min().getAsInt());
        System.out.println("numbers.stream().mapToInt(x -> x).average() = " + numbers.stream().mapToInt(x -> x).average().getAsDouble());
    }
}

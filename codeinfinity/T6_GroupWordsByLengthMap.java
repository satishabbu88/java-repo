package codeinfinity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class T6_GroupWordsByLengthMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        //write your code here
//        Map<String, Integer> map = words.stream().collect(Collectors.toMap(Function.identity(), k->k.length()));
        Map map = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);

    }
}

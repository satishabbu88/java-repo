package codeinfinity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T2_LongestNameInList {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        //write your code here
       // System.out.println(names.stream().map(String::length).reduce((n1, n2)-> (n1>n2)?n1:n2).get());
        System.out.println(names.stream().map(String::length)
                .max(Integer::compare).get());
        //String res = names.stream().max(Comparator.comparingInt(String::length)).get();
        //System.out.println(res);
    }
}
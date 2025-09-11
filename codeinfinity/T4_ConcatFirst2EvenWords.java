package codeinfinity;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T4_ConcatFirst2EvenWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        //write your code here
       // String str = words.stream().filter(i->i.length()%2==0).limit(2).reduce(String::concat).get();
        String str = words.stream().filter(i->i.length()%2==0).limit(2).collect(Collectors.joining());
        System.out.println(str);
    }
}

package codeinfinity;


import java.util.Arrays;
import java.util.List;

public class T3_TotalDistinctWordsInAllSentenses {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface for processing sequences of elements.",
                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
                "In this exercise, you need to count the total number of words in all sentences."
        );
        //write your code here
        Long count = sentences.stream().flatMap(i-> Arrays.stream(i.split(" "))).distinct().count();
        System.out.println(count);
    }
}
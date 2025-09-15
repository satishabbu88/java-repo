/**
package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderingByWeight {
    public static void main(String[] args) {
        String str = "103 123 4444 99 2000";
       List<Integer> ff=  Arrays.stream(str.split(" "))
                .collect(Collectors.toMap(Function.identity(), s->s.chars().sum()))
                .entrySet()
                .stream()
                .sorted()
                .map(e-> Integer.parseInt(e.getKey()))
                .toList();
        System.out.println(ff);
    }
}
*/
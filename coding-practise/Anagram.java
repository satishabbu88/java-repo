package org.example;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a ="abcd";
        String b = "bcad";
        System.out.print(isAnagram(a, b));
    }

    static boolean isAnagram(String source, String dest){
        return source.length()== dest.length() && Arrays.stream(source.split("")).allMatch(dest::contains);
    }
}

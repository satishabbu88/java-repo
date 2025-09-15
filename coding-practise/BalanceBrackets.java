package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BalanceBrackets {
    public static void main(String[] args) {
        String input = "({[])})";
        String[] charArr = input.split("");
        List<String> orphans = new ArrayList<>();
        Map<String, String> balanceMap = new HashMap<>();
        balanceMap.put("","");
        System.out.println(Arrays.toString(input.chars().toArray()));

        for(int i=0;i< charArr.length;i++){

        }

    }
}

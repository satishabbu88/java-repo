package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeMapElements {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("a",10);
        m1.put("b",20);
        m1.put("c",30);

        Map<String, Integer> m2 = new HashMap<>();
        m2.put("a",40);
        m2.put("b",50);
        m2.put("c",60);

        m1.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()+m2.get(e.getKey())))
                .forEach((a,b)-> System.out.println(a+ " "+b));
        System.out.println(0.2*2);
System.out.println(0.2*3);

    }
}

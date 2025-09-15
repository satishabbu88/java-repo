package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IsFrequencyUnique {
    public static boolean isFreqUniq(int n, int[] arr) {
        // code here
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i],countMap.get(arr[i])+1);
            } else{
                countMap.put(arr[i],1);
            }
        }

        Set<Integer> unique = new HashSet<>();
        for(int v: countMap.values()){
            if(!unique.add(v)){
                return true;
            }
        }
    return false;


    }
    public static void main(String[] args) {
        //boolean flag = isFreqUniq(9,new int[]{0,4,4,0,0,4,4,0,0});
        boolean flag = isFreqUniq(5,new int[]{1,1,2,5,5});
        System.out.println(flag);
    }
}

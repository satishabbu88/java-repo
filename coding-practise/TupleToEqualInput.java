package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TupleToEqualInput {
    public static void main(String[] args) {
        int input = 10;
        int[] tuple = new int[2];
        int[] array = new int[]{1,9,2,3,4,5,6,7,8,10};
        for(int i=0; i<=array.length-1; i++){
            int result = input-array[i];
            tuple[0]=array[i];
            for(int j=0;j<=array.length-1;j++){
                if(result == array[j]){
                    tuple[1]= result;
                    break;
                }
            }
            break;
        }
        //System.out.println(Arrays.toString(tuple));

        // Using HashSet
        Set<Integer> seen = new HashSet<>();
        for(int num: array){
            int complement = input - num;
            if(seen.contains(complement)){
                System.out.println("found: "+ num + " & complement: "+complement);
                return;
            }
            seen.add(num);
        }
    }
}

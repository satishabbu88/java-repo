package org.example;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(new MissingNumber().missingNumber(new int[]{1,2,3,5}));
    }

    int missingNumber(int arr[]){
        Arrays.sort(arr);
        OptionalInt op = IntStream.rangeClosed(1,arr[arr.length-1]).filter(i-> i!=arr[i-1]).findFirst();
        if(op.isPresent())return op.getAsInt();
       return 0;
    }
}

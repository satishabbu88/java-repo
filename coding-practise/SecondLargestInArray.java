package org.example;

import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
    int[] arr = {10, 10};
        getSecondLargest(arr);
    }
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int[] arr1 = Arrays.stream(arr).sorted().distinct().toArray();
        if(arr1.length==1){
            return -1;
        }
        return arr1[arr1.length-2];
    }
}

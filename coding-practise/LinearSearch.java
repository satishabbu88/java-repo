/**
package org.example;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,6,8,9,22,34,667,845,23};

        System.out.println(linearSearch(arr1,32));
    }
    static boolean linearSearch(int[] arr, int numToSearch){
        boolean isFound = false;
        for(int ele: arr){
            if(ele==numToSearch){
                isFound = true;
            }
        }
        return !Arrays.stream(arr).filter(a->a ==numToSearch).findFirst().isEmpty();

    }
}
*/
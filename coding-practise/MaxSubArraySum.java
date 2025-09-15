package org.example;

import java.util.ArrayList;

public class MaxSubArraySum {
    public static void main(String[] args) {
        //System.out.println(new MaxSubArraySum().maxSubarraySum(new int[]{-1, -2, -3, -4}));
        System.out.println(new ArrayList<>().get(0));
    }
    int maxSubarraySum(int[] arr) {
        // Your code here
        int index=0;
        int maxSum = maxOfArray(arr);
        while(!hasAllZeros(arr)){
            int tempSum = arraySum(arr);
            if(tempSum>maxSum){
                maxSum = tempSum;
            }
            arr[index]=0;
            index++;
        }
        return maxSum;

    }
    int maxOfArray(int[] arr){
        int max=arr[0];
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        return max;
    }

    boolean hasAllZeros(int[] arr){
        boolean flag=true;
        for(int e: arr){
            if(e!=0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    int arraySum(int[] a){
        int sum=0;
        for(int e: a){
            sum+=e;
        }
        return sum;
    }

}

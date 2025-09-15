package org.example;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{51,87};
        System.out.println(leaders(arr));

    }
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        boolean isBig = true;
        java.util.ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    isBig = true;
                }else{
                    isBig = false;
                }
                if(!isBig) break;
            }
            if(isBig || i==arr.length-1){
                list.add(arr[i]);
            }
        }


        return list;
    }
}

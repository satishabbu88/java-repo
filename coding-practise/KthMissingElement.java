package org.example;

public class KthMissingElement {
    public static void main(String[] args) {
        System.out.println(KthMissingElement(new int[]{1,3,4,5,7},2));
    }
    static int KthMissingElement(int arr[], int k) {
        // Complete the function
        int missing; int missingCount=0;
        for(int i=arr[0];i<arr.length-1;i++){
                while(i!=arr[i]){
                    missing=arr[i]+1;
                    missingCount++;
                    if(missingCount ==k){
                        return missing;
                    }
                }
        }
        return -1;
    }
}

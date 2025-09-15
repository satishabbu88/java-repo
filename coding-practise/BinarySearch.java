package org.example;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,6,8,9,22,23,34,667,845};
        int res = binarySearch(arr1,44);
        if(res == -1){
            System.out.println("not found");
        }else{
            System.out.println("found at: "+ res);
        }

    }
    static int binarySearch(int[] arr, int numToSearch){
        int first = 0;
        int last = arr.length-1;
        int mid = (first+last)/2;
        while(first<=last){
            if(numToSearch == arr[mid]){
                return mid;
            }else if(numToSearch>arr[mid]){
                first = mid+1;
            } else{
                last = mid-1;
            }
            mid= (first+last)/2;
        }
        return -1;
    }

}

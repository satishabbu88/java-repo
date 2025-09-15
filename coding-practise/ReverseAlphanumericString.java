package org.example;

public class ReverseAlphanumericString {
    public static void main(String[] args) {
        String s = "$h@nuar&G%r*s";
        char[] arr = s.toCharArray();
        char temp;
        for(int i = 0, j = arr.length-1; i<=arr.length-1 && j >= 0; i++, j--){
            if(Character.isLetterOrDigit(arr[i]) && Character.isLetterOrDigit(arr[j])){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (char k: arr){
            System.out.print(" "+k);
        }
    }
}

package org.example;

public class TrailingZerosInFact {
    public static void main(String[] args) {
        System.out.println(zerosCount(100));
    }

    static int zerosCount(int num){
        int count=0;
        for(int i=5;num/i>=1;i*=5){
            count+=num/i;
        }
        return count;
    }
}

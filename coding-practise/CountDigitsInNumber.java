package org.example;

import java.util.Collections;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        System.out.println(countDigits(19090));

    }
    static int countDigits(int number){
        int count=0;
        while(number>0){
            number = number/10;
            count++;
        }
        return count;
    }
}

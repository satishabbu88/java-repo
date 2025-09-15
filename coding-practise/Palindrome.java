package org.example;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(4));
    }
    static boolean isPalindrome(int number){
        int revNumber=0;
        int orignalNumber = number;
        while(number>0){
            revNumber = revNumber*10 + (number % 10);
            number = number/10;
        }
        return orignalNumber == revNumber;
    }
}

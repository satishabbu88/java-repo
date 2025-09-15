package org.example;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fact(7));
    }
    static long fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        return num * fact(num-1);
    }
}

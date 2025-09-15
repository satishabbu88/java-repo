package org.example;

public class FactorialUsingIteration {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}

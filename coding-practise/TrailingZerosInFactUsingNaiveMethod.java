package org.example;

public class TrailingZerosInFactUsingNaiveMethod {
    public static void main(String[] args) {
        System.out.println(zeroCountInFact(10));
        //wont work for bigger numbers
    }
    static int zeroCountInFact(int num){
        long fact=1;
        int count=0;
        for(int n=2;n<=num;n++){
            fact*=n;
        }
        System.out.println("factorial is : " +fact);
         while(fact%10==0){
             count++;
             fact=fact/10;
         }

        return count;
    }

}

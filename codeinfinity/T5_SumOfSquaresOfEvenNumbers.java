package codeinfinity;

import java.util.Arrays;
import java.util.List;

public class T5_SumOfSquaresOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //write your code here
        //Integer sum = numbers.stream().filter(i->i%2==0).map(i->i*i).reduce(Integer::sum).get();
        Integer sum = numbers.stream().filter(i->i%2==0).mapToInt(i->i*i).sum();
        System.out.println(sum);
    }
}

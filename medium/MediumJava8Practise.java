/**
package medium;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MediumJava8Practise {
    public static void main(String[] args) {
        //https://medium.com/@bhangalekunal2631996/java-stream-api-coding-interview-questions-and-answers-2a212505e1c6

        //1.Write a program to find the sum of all elements in a list using Java Stream API
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce((a,b)-> a+b)
                .get();
        //System.out.println(sum);
        int sum2 = numbers.stream()
                .collect(Collectors.summingInt(Integer::valueOf)).intValue();
        //System.out.println(sum2);
        int sum3 = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        //System.out.println(sum3);


        //2.Given a list of integers, write a program to find and print the maximum element using Java Stream API
        List<Integer> numbers2 = Arrays.asList(2, 4, 8, 6, 10);
        Integer maxEle = numbers2.stream()
                .max(Integer::compare)
                .get();
        //System.out.println(maxEle);
        Integer maxEle2 = numbers2.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        //System.out.println(maxEle2);


        //3.Write a program to filter out all the even numbers from a list using Java Stream API
        List<Integer> evenList = numbers.stream()
                .filter(e->e%2==0)
                .toList();
        //System.out.println(evenList);

        //4.Given a list of strings,
        // write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        long count = strings.stream()
                .filter(s-> Arrays.asList(s.split("")).contains("a"))
                .count();
        //System.out.println(count);
        long count2 = strings.stream()
                .filter(s->s.contains("a"))
                .count();
        //System.out.println(count2);

        long count3 = strings.stream()
                .filter(s->s.contains(String.valueOf('a')))
                .count();
        //System.out.println(count3);

        //5.Write a program to convert a list of strings to uppercase using Java Stream API.
        List<String> upperCasedStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();
        //System.out.println(upperCasedStrings);

        //6.Given a list of integers,
        // write a program to calculate the average of all the numbers using Java Stream API.
        double avg = numbers.stream()
                .collect(Collectors.averagingDouble(Integer::doubleValue))
                .doubleValue();
        //System.out.println(avg);
        int avg2 = numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue))
                .intValue();
        //System.out.println(avg2);
        double avg3 = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getAverage();
       // System.out.println(avg3);
        double avg4 = numbers.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();
        //System.out.println(avg4);

        //7.Write a program to sort a list of strings in alphabetical order using Java Stream API.
        List<String> sortedStrs =strings.stream()
                .sorted()
                .toList();
        //System.out.println(sortedStrs);

        //8.Given a list of strings, write a program to concatenate all the strings using Java Stream API.
        String concatString = strings.stream()
                .collect(Collectors.joining());
        //System.out.println(concatString);

        //9.Write a program to find the longest string in a list of strings using Java Stream API.
        List<String> stringZ = Arrays.asList("apple", "banana", "orange", "grape");
        String longestStr = stringZ.stream()
                        .max(Comparator.comparingInt(String::length))
                        .get();
        //System.out.println(longestStr);

        //10.Given a list of integers,
        // write a program to find and print the second largest number using Java Stream API.
        Integer secondLargeNum = numbers2.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        //System.out.println(secondLargeNum);

        //11.Write a program to remove all the duplicate elements from a list using Java Stream API.
        List<Integer> dupNumbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
        List<Integer> uniqueNumbers = dupNumbers.stream()
                .distinct()
                .toList();
        //System.out.println(uniqueNumbers);

        //12.Given a list of strings,
        // write a program to find and print the shortest string using Java Stream API.
        List<String> strings2 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        String shortestString = strings2.stream()
                .min(Comparator.comparingInt(String::length))
                .get();
        //System.out.println(shortestString);

        //13.Write a program to convert a list of integers to a list of their squares using Java Stream API.
        List<Integer> squares = numbers.stream()
                .map(e->e*e)
                .toList();
        //System.out.println(squares);

        //14.Given a list of strings,
        // write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
        List<String> strsStartsWithA = strings2.stream()
                .filter(s->s.startsWith("a"))
                .toList();
        //System.out.println(strsStartsWithA);

        //15.Write a program to find the product of all elements in a list of integers using Java Stream API.
        Integer productOfNums = numbers.stream()
                .reduce((i1,i2)->i1*i2)
                .get();
        //System.out.println(productOfNums);

        //16.Given a list of integers,
        // write a program to find and print the prime numbers using Java Stream API.
        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

        List<Integer> primes = numbers3.stream()
                .filter(e->{
                    for(int i=2;i<= Math.sqrt(e);i++){
                        if(e%i==0){
                            return false;
                        }
                    }
                    return true;
                })
                .toList();
        //System.out.println(primes);


        //17.Write a program to check if a list of strings contains a specific string using Java Stream API.
        String target = "banana";
        boolean containsStr = strings2.stream().anyMatch(target::equals);
        //System.out.println(containsStr);

        //18.Given a list of strings,
        // write a program to find and print the strings with length greater than a specified value 5 using Java Stream API.
        List<String> greStrs = strings2.stream()
                .filter(s->s.length()>5)
                .toList();
        //System.out.println(greStrs);

        //19.Write a program to
        // filter out all the elements divisible by 3 and 5 from a list of integers using Java Stream API.
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<Integer> divNums = numbers4.stream()
                .filter(e-> e%3==0 && e%5==0)
                .toList();
        //System.out.println(divNums);

        //20.Given a list of strings,
        // write a program to find and print the strings with the maximum length using Java Stream API.
        Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> maxLenStrs = strings2.stream()
                .collect(Collectors.groupingBy(String::length))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByKey())
                                .map(Map.Entry::getValue)
                                        .get();
        //System.out.println(maxLenStrs);

        //21.Write a program to reverse a list of strings using Java Stream API.
        Object[] arr = strings2.toArray();
        List<Object> list = IntStream.range(0, strings2.size())
                .mapToObj(i-> arr[arr.length-1-i]).toList();
        //System.out.println(list);
        List<String> strings22 = IntStream.range(0,strings2.size())
                .mapToObj(i-> strings2.get(strings2.size()-1-i) )
                .toList();
        //System.out.println(strings22);

        //22.Given a list of integers,
        // write a program to find and print the distinct odd numbers using Java Stream API.
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> distOddNums = numbers5.stream()
                .distinct()
                .filter(e->e%2==1)
                .toList();
        //System.out.println(distOddNums);

        //23.Write a program to remove all null values from a list of strings using Java Stream API.
        List<String> nullStrings = Arrays.asList("apple", null, "banana", null, "kiwi", "orange", null, "pear");
        List<String> nonNullStrs = nullStrings.stream()
                .filter(Objects::nonNull)
                .toList();
        //System.out.println(nonNullStrs);

        //24.Given a list of integers,
        // write a program to find and print the sum of all odd numbers using Java Stream API.
        int sum1 = numbers5.stream()
                .filter(e-> e%2==1)
                .mapToInt(Integer::intValue)
                .sum();
        //System.out.println(sum1);
        int sum11 = numbers5.stream()
                .filter(e->e%2==1)
                .collect(Collectors.summingInt(Integer::intValue));
        //System.out.println(sum11);


        //25.Write a program to find the intersection of two lists of strings using Java Stream API.
        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");
        List<String> intSecList = list1.stream()
                .filter(list2::contains)
                .toList();
        //System.out.println(intSecList);

        //26.Given a list of strings,
        // write a program to find and print the strings containing only vowels using Java Stream API.
        List<String> strings1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "oai");
        List<String> vowelStrs = strings1.stream()
                .filter(s-> Arrays.stream(s.split("")).allMatch(e->List.of("a","e","i","o","u").contains(e)))
                .toList();
        //System.out.println(vowelStrs);

        //27.Write a program to convert a list of strings to a comma-separated string using Java Stream API.
        String commStr = strings2.stream().collect(Collectors.joining(", "));
        //System.out.println(commStr);

        //28.Given a list of integers,
        // write a program to find and print the index of the first occurrence of a specific number using Java Stream API.
        int targetNumber = 7;
        List<Integer> numbers6 = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
        long indexOfFirstOcc = IntStream.range(0,numbers6.size())
                        .filter(i-> numbers6.get(i)==targetNumber)
                                .findFirst()
                                        .getAsInt();
        //System.out.println(indexOfFirstOcc);
        //System.out.println( numbers6.indexOf(targetNumber));

        //29.Write a program to find the union of two lists of integers using Java Stream API.
        List<Integer> list11 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list22 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> unionList = Stream
                .concat(list11.stream(), list22.stream())
                .distinct()
                .toList();
        //System.out.println(unionList);

        //30.Given a list of strings,
        // write a program to find and print the strings containing duplicate characters using Java Stream API.
        List<String> strings3 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "strawberry", "watermelon");
        List<String> dupCharStrs = strings3.stream()
                .filter(s->{
                    Set<String> uniqSet = new HashSet<>();
                    return Arrays.stream(s.split("")).anyMatch(c->!uniqSet.add(c));
                })
                .toList();
        //System.out.println(dupCharStrs);
        List<String> dupCharStrs2 = strings3.stream()
                .filter(s->s.length() != s.chars().distinct().count())
                .toList();
        //System.out.println(dupCharStrs2);

        //31.Write a program to check if all elements
        // in a list of strings are of the same length using Java Stream API.
        boolean allEleSameLen = strings2.stream()
                .allMatch(s->strings2.get(0).length()==s.length());
        //System.out.println(allEleSameLen);
        boolean allEleSameLen2 = strings2.stream()
                .map(String::length)
                .distinct()
                .count()== 1;
       // System.out.println(allEleSameLen2);

        //32.Given a list of integers,
        // write a program to find and print the difference between the maximum and minimum numbers using Java Stream API.
        List<Integer> numbers1 = Arrays.asList(10, 5, 7, 18, 3, 15);
        IntSummaryStatistics sts = numbers1.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        int diff = sts.getMax()-sts.getMin();
        //System.out.println(diff);

        //33.Write a program to remove all whitespace from a list of strings using Java Stream API.
        List<String> stringsWithSpace = Arrays.asList("apple", "ba nana", "kiwi", "oran ge", "pear");
        List<String> strsWithoutSpace = stringsWithSpace.stream()
                .map(s-> Arrays.stream(s.split(" ")).collect(Collectors.joining()))
                .toList();
        //System.out.println(strsWithoutSpace);
        List<String> strsWithoutSpace1 = stringsWithSpace.stream()
                .map(s-> String.join("",s.split(" ")))
                .toList();
        //System.out.println(strsWithoutSpace1);

        //34. Given a list of strings,
        // write a program to find and print the strings containing a specific substring using Java Stream API.
        String substring = "an";
        List<String> lstWithSubstr = strings2.stream()
                .filter(s->s.contains(substring))
                .toList();
        //System.out.println(lstWithSubstr);

        //35.Write a program to find the mode(highest repeated element) of a list of integers using Java Stream API.
        List<Integer> modNumbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
        Integer mode = modNumbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        // System.out.println(mode);

        //36.Given a list of strings,
        // write a program to find and print the strings with the minimum length using Java Stream API.
        List<String> minLenStrs = strings2.stream()
                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .min(Comparator.comparingInt(Map.Entry::getKey))
                .get()
                .getValue();
        //System.out.println(minLenStrs);

        //first occurrence of min
        // System.out.println(strings2.stream().min(Comparator.comparingInt(String::length)).get());

        //37.Write a program to find the frequency of each element in a list of integers using Java Stream API.
        Map<Integer, Long> map = modNumbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(map);

        //38.Given a list of strings,
        // write a program to find and print the strings with the maximum number of vowels using Java Stream API.
        List<String> maxVoStrs = strings2.stream()
                        .collect(Collectors.toMap(Function.identity(),s-> s.chars().filter(c-> "AEOIUaeiou".indexOf(c) != -1).count()))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .stream()
                        .map(Map.Entry::getKey)
                        .toList();
        //System.out.println(maxVoStrs);

        //reverse string
        String str = "12345";
        String revStr = Arrays.stream(str.split("")).reduce("",(a,b)-> b+a);
       // System.out.println(revStr);






    }
}
*/
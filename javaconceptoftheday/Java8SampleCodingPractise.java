package javaconceptoftheday;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
It has solutions for the problems using attached "Java 8 features" list 
*/
public class Java8SampleCodingPractise {
    public static void main(String[] args) {
		

        //1) Given a list of integers, separate odd and even numbers?
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<String, List<Integer>> evenOrOdd = listOfIntegers.stream()
                .collect(Collectors.groupingBy(e -> e % 2 == 0 ? "even" : "odd"));
        //System.out.println(evenOrOdd);
        //2) How do you remove duplicate elements from a list using Java 8 streams?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> listOfStringsRes = listOfStrings.stream()
                .distinct().toList();
        //System.out.println(listOfStringsRes);

        // 3) How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        List<String> strList = Arrays.stream(inputString.split(""))
                .filter(e -> !" ".equals(e)).toList();
        Map<String, Long> freqOfChars = strList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //System.out.println(freqOfChars);

        //4) How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stationeryListRes = stationeryList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(stationeryListRes);

        //5) How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> decimalListRes = decimalList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(decimalListRes);


        //6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings2 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String listOfStrings2Res = listOfStrings2.stream().collect(Collectors.joining(",","[","]"));
        //System.out.println(listOfStrings2Res);

        //7) From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        //listOfIntegers2.stream()
              //  .filter(e->e%5==0).forEach(System.out::println);


        //8) Given a list of integers, find maximum and minimum of those numbers?
        IntSummaryStatistics sts = listOfIntegers2.stream()
                .collect(Collectors.summarizingInt(Integer::valueOf));
        // System.out.printf("max: %d, min: %d",sts.getMax(),sts.getMin());
       // System.out.println(listOfIntegers2.stream().max(Integer::compare).get());

        //9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};
        int[] ab = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
        //System.out.println(Arrays.toString(ab));

        //10) How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] a1 = new int[]{4, 2, 5, 1};
        int[] b1 = new int[]{8, 1, 9, 5};
        int[] ab11 = IntStream.concat(Arrays.stream(a1), Arrays.stream(b1)).distinct().toArray();
        //System.out.println(Arrays.toString(ab11));


        //11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        //System.out.println(listOfIntegers3.stream().sorted().limit(3).toList());
        //System.out.println(listOfIntegers3.stream().sorted(Comparator.reverseOrder()).limit(3).toList());

        //12) Java 8 program to check if two strings are anagrams or not?
        String ss1 = "RaceCar";
        String ss2 = "CarRace";
        boolean isAnagram = Arrays.stream(ss1.split(""))
                .sorted()
                .collect(Collectors.joining())
                .equalsIgnoreCase(Arrays.stream(ss2.split("")).sorted().collect(Collectors.joining()));
       // System.out.println(isAnagram);

        //13) Find sum of all digits of a number in Java 8?
        int i = 15623;
       // System.out.println(Arrays.stream(Integer.toString(i).split("")).mapToInt(Integer::valueOf).sum());
        //System.out.println(Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::valueOf)));


        //14) Find second largest number in an integer array?
        List<Integer> listOfIntegers4 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int secondLargest = listOfIntegers4.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
       // System.out.println(secondLargest);

        //15) Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings3 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> orderedStrings = listOfStrings3.stream()
                .sorted(Comparator.comparingInt(String::length)).toList();
        //System.out.println(orderedStrings);

        //16) Given an integer array, find sum and average of all elements?
        int[] inta = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        IntSummaryStatistics stats = Arrays.stream(inta)
                .boxed()
                .collect(Collectors.summarizingInt(Integer::valueOf));
        //System.out.printf("sum: %d, avg: %f", stats.getSum(), stats.getAverage());

        //17) How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        List<Integer> commonList = list1.stream()
                .filter(list2::contains)
                .toList();
        //System.out.println(commonList);

        //18) Reverse each word of a string using Java 8 streams?
        String str = "Java Concept Of The Day";
        String revStr = Arrays.stream(str.split(" "))
                .map(e-> new StringBuffer(e).reverse())
                .collect(Collectors.joining(" "));
        //System.out.println(revStr);


        //19) How do you find sum of first 10 natural numbers?
        int sumOfNumbers = IntStream.rangeClosed(1,10).sum();
        //System.out.println(sumOfNumbers);

        //20) Reverse an integer array
        int[] array = new int[]{5, 1, 7, 3, 9, 6};
        int[] revArray = IntStream.range(0, array.length)
                .map(e-> array[array.length-1-e])
                .toArray();
        //System.out.println(Arrays.toString(revArray));

        //21) Print first 10 even numbers
        //IntStream.rangeClosed(1,20).filter(e->e%2==0).limit(10).forEach(System.out::println);
        //IntStream.rangeClosed(1,10).map(e->e*2).forEach(System.out::println);

        //22) How do you find the most repeated element in an array?
        List<String> listOfStrs = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        String mostRepeated = listOfStrs.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
        //System.out.println(mostRepeated);


        //23) Palindrome program using Java 8 streams
        String testStr = "ROTATOR";
        boolean isPalindrome = IntStream.rangeClosed(0,testStr.length()/2)
                .allMatch(e->testStr.charAt(e)==testStr.charAt(testStr.length()-1-e));
       // System.out.println(isPalindrome);
        //System.out.println(testStr.contentEquals(new StringBuilder(testStr).reverse()));


        //24) Given a list of strings, find out those strings which start with a number?
        List<String> numStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");


        //25) How do you extract duplicate elements from an array?
        List<Integer> lstOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> set = new HashSet<>();
        List<Integer> dupList = lstOfIntegers.stream()
                .filter(e->!set.add(e))
                .toList();
        //System.out.println(dupList);
        List<Integer> dupList2 = lstOfIntegers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        //System.out.println(dupList2);


        //26) Print duplicate characters in a string?
        String inpString = "Java Concept Of The Day";
        List<String> dupChars = Arrays.stream(inpString.split(""))
                .map(String::toLowerCase)
                .filter(e->!" ".equals(e))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        //System.out.println(dupChars);


        //27) Find first repeated character in a string?
        String firstRepeatedChar = Arrays.stream(inputString.split(""))
                .filter(e->!" ".equals(e))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .findFirst()
                .get()
                .getKey();
        //System.out.println(firstRepeatedChar);

        //28) Find first non-repeated character in a string?
        String firstNonRepeatedChar = Arrays.stream(inputString.split(""))
                .filter(e->!" ".equals(e))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .findFirst()
                .get()
                .getKey();
        //System.out.println(firstNonRepeatedChar);

        //29) Fibonacci series
//        Stream.iterate(new int[]{0,1}, f-> new int[] {f[1], f[0]+f[1]})
//                .limit(10)
//                .map(f-> f[0])
//                .forEach(System.out::println);


        //30) First 10 odd numbers
//        Stream.iterate(new int[]{1}, f-> new int[]{f[0]+2})
//                .limit(10)
//                .map(f->f[0])
//                .forEach(System.out::println);
//        Stream.iterate(new int[]{1,3}, f-> new int[]{f[1],f[1]+2})
//                .limit(10)
//                .map(f->f[0])
//                .forEach(System.out::println);

//        IntStream.rangeClosed(1,20)
//                .filter(e-> e%2==1)
//                .limit(10)
//                .forEach(System.out::println);

        //31) How do you get last element of an array?
        List<String> listOfStrings4 = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String last = listOfStrings4.stream()
                .skip(listOfStrings4.size()-1)
                .findFirst()
                .get();
        //System.out.println(last);


        //32) Find the age of a person in years if the birthday has given?
        LocalDate birthDay2 = LocalDate.of(1985, 01, 23);
        //System.out.println(ChronoUnit.YEARS.between(birthDay2, LocalDate.now()));


    }
}

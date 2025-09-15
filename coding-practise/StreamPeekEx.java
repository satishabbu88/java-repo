package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeekEx {
    public static void main(String[] args) {
        Stream.of("Hello", "Hi", "Welcome", "Goodbye!").peek(System.out::println).map(String::toUpperCase).forEach(System.out::println);
    }
}

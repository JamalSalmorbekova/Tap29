package com.company;

import java.util.Arrays;
import  java.util.IntSummaryStatistics;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

    public class Main {

    public static void main(String[] args) {
	List<Integer>integers = Arrays.asList(4,24,13,12,36,19,25,31,28,10,22,39,42,16);
    integers.stream().filter(a -> a%2==0).map(a-> a*a).
            max(Integer::compare).ifPresent(System.out::println);

    }

}

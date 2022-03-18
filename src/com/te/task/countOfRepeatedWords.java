package com.te.task;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class countOfRepeatedWords {
	public static void main(String[] args) {
		String[] str = {"A", "B", "A", "C", "B","J","l"};
		Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(a-> a,Collectors.counting()));
		System.out.println(collect);
	}

}

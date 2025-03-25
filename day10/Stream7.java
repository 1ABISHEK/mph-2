package com.mph.day10;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream7 {

	public static void main(String[] args) {
		List<String> strlist = Arrays.asList("Rat", "Cat", "Mat","", "Lion", "Elephant", "Tiger");
		System.out.println(strlist);

//		long count = countStrWithLength3(strlist);
//		System.out.println(count);
		
		long count = strlist.stream().filter(str->str.length()==3).count();
		System.out.println(count);
		
		List<String> slist = strlist.stream().filter(str->str.length()==3).collect(Collectors.toList());
		System.out.println(slist);
		
		long elist = strlist.stream().filter(str ->str.isEmpty()).count();
		System.out.println(elist);
		
		List<Integer> ilist = Arrays.asList(1,2,3,5,47,6,7,8,9);
		System.out.println(ilist);
		
		ilist.stream().sorted().distinct().forEach(System.out::println);
		
		IntSummaryStatistics stat = ilist.stream().mapToInt(num -> num).summaryStatistics();
		System.out.println("Max "+stat.getMax());
		System.out.println("Min "+stat.getMin());
		System.out.println("Sum "+stat.getSum());
		System.out.println("Count "+stat.getCount());
		System.out.println("Avg "+stat.getAverage());
	}

	private static long countStrWithLength3(List<String> strlist) {
		int count = 0;
		for(String str:strlist) {
			if(str.length()==3) {
				count++;
			}
		}
		return count;
	}

}

package com.mph.day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		// \\d takes single digit
		
		// \\d+ takes more than three Digit
		String regex = "\\S+";
		String input = "The price is 250 ruppiyaa";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.println("Found "+matcher.group());
		}
		
		int b=4;
		System.out.println(b--);
		System.out.println(b);
		System.out.println(b);

	}

}

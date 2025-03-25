package com.mph.day10;

import java.util.Scanner;
import java.util.regex.*;

public class RegexValidation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String email = s.next();
		String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
		
		boolean isValid = Pattern.matches(emailPattern,email);
		System.out.println("Email is Valid "+isValid);
	}

}

package com.mph.sample;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "I Love Chennai";
		String s4 = "Java";
		String s5 = null;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s3.length());
		System.out.println(s4.isEmpty());
		System.out.println(s2.isBlank());
		System.out.println(s1.concat(s3));
		System.out.println(s2.contains(s3));
		System.out.println(s1==s4);
		System.out.println(s3.indexOf("hennai"));
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.substring(2,8));
		System.out.println("   Hello    ".trim());
		System.out.println(s1.endsWith(s3));
		System.out.println(s1.intern());
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.codePointAt(1));

	}

}

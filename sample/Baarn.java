package com.mph.sample;

public class Baarn {

	public static void main(String[] args) {
		String s = "420";
		s+=42;
		System.out.println(s);
		
		String s1 = "34567";
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1+" "+s1);
		System.out.println(s1.hashCode());
	
	}
	
	

}

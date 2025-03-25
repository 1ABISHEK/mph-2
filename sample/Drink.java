package com.mph.sample;


import java.util.*;
public class Drink implements Comparable<Drink>{
	public String name;
	public int compareTo(Drink o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Drink [name=" + name + "]";
	}
	public static void main(String args[]) {
		Drink one  = new Drink();
		Drink two = new Drink();
		Drink three = new Drink();
		one.name = "Coffee";
		two.name = "Tea";
		three.name = "Boost";
		TreeSet set = new TreeSet();
		set.add(one);
		set.add(two);
		set.add(three);
		Iterator i = set.iterator();
		while(i.hasNext())
		System.out.print(i);
		
		
	}

	

	
}

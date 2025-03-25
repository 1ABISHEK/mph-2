package com.mph.sample;

public class NameCounter {
	private final String name;
	private int count;
	public NameCounter(String name) {
		this.name = name;
	}
	public  String getName() {
		return name;
	}
	public void increment() {
		count++;
	}
	public  int getCount() {
		return count;
	}
	public  void reset() {
		count = 0;
	}
	public static void main(String []a) {
		NameCounter nc = new NameCounter("Abishek");
	System.out.println(nc.getName());	
	nc.increment();	
	System.out.println (nc.getCount());
		nc.reset();
	}
}

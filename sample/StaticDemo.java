package com.mph.sample;

class First {
	int x = 30;
	static int y = 40;

	static class InnerClass {
	}

	public void regularMethod() {
		System.out.println("X " + x);
		System.out.println("Y " + y);
	}

	public static void staticMethod() {
		//static int z = 99;
		//System.out.println("x " + x);
		System.out.println("y " + y);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		First s1 = new First();
		//s1.regularMethod();
		First s2  = new First();
		s2.regularMethod();
		s2.staticMethod();
	}

}

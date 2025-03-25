package com.mph.sample;

abstract class Vehicle {
	int nowheel = 4;
	String fuel;

	Vehicle() {
		System.out.println("Vehicle Constr... ");
	}

	public void start() {
		System.out.println("Starting... ");
	}

	public abstract void move();
}

class Bus extends Vehicle {

	@Override
	public void move() {
		System.out.println("Bus Moving");

	}

}

public class AbstractDemo {

	public static void main(String[] args) {
		Vehicle c;
		Bus bus = new Bus();
		bus.start();
		bus.move();
	}

}

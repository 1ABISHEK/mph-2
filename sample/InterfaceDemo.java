package com.mph.sample;

interface TwoWheelers {
	int noofwheel = 2;
	public void move();
}

interface Veh{
	public void start();  
}
class Animal implements TwoWheelers,Veh{

	@Override
	public void move() {
		System.out.println("Animal Stares... ");
		
	}

	@Override
	public void start() {
		System.out.println("Vehicle Ready to Move");
		
	}
	
}
class Bike implements TwoWheelers{

	@Override
	public void move() {
		System.out.println("Bike Moving... ");
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		TwoWheelers tw;
		Bike b = new Bike();
		b.move();
		Animal a = new Animal();
		a.start();
		a.move();
	}

}

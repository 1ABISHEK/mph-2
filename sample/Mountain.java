package com.mph.sample;
class Atom{
	Atom(){
		System.out.print("atom");
	}
}
class Rock extends Atom{
	Rock(String type){
		System.out.print(type);
	}
}
public class Mountain extends Rock{
	Mountain(){
	super("granite");
	new Rock("granite");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mountain();
	}

}

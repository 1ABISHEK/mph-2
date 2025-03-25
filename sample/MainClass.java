package com.mph.sample;


class Emp{
	int eno = 101;
	String name = "Abishek";
	
	Emp(){
		
	}
	Emp(int eno){
		this.eno=eno;
		System.out.println("p. Emp constr");
	}
	public String getEmpDetail() {
		return eno +"  "+ name;
	}
}

class Manager extends Emp{
	String cmp_name = "Mphasis";
	
	public Manager() {   // 
		super(500);		// super method has to be first in constructor
		System.out.println("Manager count..");
	}
	public String getEmpDetail() {
		return super.getEmpDetail() +"  "+ name+" "+cmp_name;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp  e =new Emp();
		System.out.println(e.getEmpDetail());
		
		Manager m = new Manager();
		System.out.println(m.getEmpDetail());
		
		
		Manager m1 = (Manager)new Emp();
		System.out.println(m1.getEmpDetail());
	}

}

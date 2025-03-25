package com.mph.sample;

interface Foo{
	
}
class Money{
	private String c = "A";

	public String getC() {
		return c;
	}
}
class Alpha extends Money{
	public String get() {
		return super.getC();
	}
}
class Beta extends Alpha{
	
}
class Delta extends Beta{

	public static void main(String[] args) {
		Beta x = new Beta();
//		Alpha a = x;
//		Foo f = (Delta)x;
//		Foo f = (Alpha)x;
//		Beta b = (Beta)(Alpha)x;
	}

}

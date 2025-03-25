package com.mph.Day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

import com.mph.*;

interface Calculate{
	public int add(int a,int b);
}

public class LamdaEg {

	public static void main(String[] args) {
//		Calculate add=(a,b)->{
//			return a+b;
//		};
//		System.out.println("Addition: "+add.add(4,9));
		
		
		// java 8-1
		Runnable r=()-> {
		
		Task t = new Task();
		t.show();
		};
		Thread th = new Thread(r);
		th.start();
		
		//java 8-2
		
		Thread t1 = new Thread(() ->{
			Task t = new Task();
			t.show();
		});
		t1.start();
		
		//java 8-3
		
		new Thread(() ->{
			Task t =new Task();
			t.show();
		}).start();
		
		//java 8-4
		
		new Thread(()->{
			new Task().show();
			}).start();
		
		//java 8-5
		new Thread(new Task()::show).start();
		
		Employee e1 = new Employee(12,"Ram");
		Employee e2 = new Employee(2,"Abishek");
		Employee e3 = new Employee(3,"Seetha");
		
		List elist = Arrays.asList(e1,e2,e3);
		System.out.println(elist);
		elist.forEach(li->System.out.println(li)); 
		
		BiPredicate<String, String> p = (un, pw) -> un.equals("Abishek") && pw.equals("pass");
		if (p.test("Abishek", "pass")) {
			System.out.println("OK");
		} else {
			System.out.println("Not OK");
		}

		Supplier<String> s = () -> {
			return "Abishek";
		};
		System.out.println(s.get());

		Function<Integer, String> res = (num) -> {
			if (num % 2 == 0) {
				return "Even";
			} else {
				return  "Odd";
			}
		};
		System.out.println(res.apply(999999998));

	}

}

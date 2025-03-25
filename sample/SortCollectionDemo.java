package com.mph.sample;

import java.util.*;
import com.mph.*;
public class SortCollectionDemo {

	public static void main(String[] args) {
		int ar[] = {45,78,12,6,50};
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		
		List list = new ArrayList();
		list.add(45);
		list.add(78);
		list.add(12);
		list.add(6);
		list.add(50);
		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
		Employee e1 = new Employee(1, "Abishek");
		
		Employee e2 = new Employee(24,"Zdhavan");
		
		Employee e3 = new Employee(3,"Praveen");
		
		List e = Arrays.asList(e1,e2,e3);
		System.out.println(e);
		Collections.sort(e);
		System.out.println(e);
		
		
		Collections.sort(e,Employee.idComparator);
		System.out.println(e);
	}

}

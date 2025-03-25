package com.mph.sample;

import java.util.*;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Set;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.HashMap;

public class CollectionDemo {

	public static void main(String[] args) {
		
		
		
		Set l = new TreeSet();
		l.add("Abishek");
		l.add("Abishek");
//		l.add(1);
//		l.add(2.5);
//		l.add(5);
		System.out.println(l);
		
		List list = new ArrayList();
		list.add("Abishek");
		list.add("Abishek");
		list.add(1);
		list.add(2.5);
		list.add(null);
		System.out.println(list);
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Map ma = new TreeMap();
		ma.put(1,"Abishek");
		ma.put(2,"Abishek");
		ma.put(3,1);
		ma.put(3,"true");
		ma.put(5,null);
		ma.put(7,5);
		System.out.println(ma);
		Collection c = ma.values();
		Iterator a = c.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
//		
//		List link = new LinkedList();
//		link.add("Abishek");
//		link.add("Abishek");
//		link.add(1);
//		link.add(2.5);
//		link.add(null);
//		System.out.println(link);
//		
	}

}

package com.oppo;

import java.util.*;

public class HashSetIMp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		HashSet<String> hashSet = new HashSet<>();
//		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//		hashSet.add("apple");
//		hashSet.add("banana");
//		hashSet.add("orange");
//		hashSet.add(null);
//		hashSet.add(null);
//		linkedHashSet.add("apple");
//		linkedHashSet.add("banana");
//		linkedHashSet.add("orange");
//		linkedHashSet.add(null);
//		System.out.println("HashSet:");
//		for (String fruit : hashSet) {
//		System.out.println(fruit);
//		}
//		System.out.println("LinkedHashSet:");
//		for (String fruit : linkedHashSet) {
//	
//		System.out.println(fruit);
//		}
//		
//		
//		
		TreeSet<Integer> ts = new TreeSet<Integer>();		
		ts.add(4);
		ts.add(2);
		ts.add(9);
		ts.add(5);
		ts.add(8);
		ts.add(3);
		ts.add(4);
		
		System.out.println(ts);
	
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("orange");
		hashSet.add("melon");
		hashSet.add("grapes");
		hashSet.add("cherry");

		TreeSet<String> ts2 = new TreeSet<String>(hashSet);
		System.out.println(ts2);
	}

}

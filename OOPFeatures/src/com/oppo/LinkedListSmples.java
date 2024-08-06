package com.oppo;

import java.util.*;

public class LinkedListSmples {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Alice");
		linkedList.add("Bob");
		linkedList.add("Charlie");
		System.out.println("LinkedList: " + linkedList);

		linkedList.remove();
		linkedList.add("David");
		System.out.println("LinkedList: " + linkedList);
		
		
		LinkedList< Integer> l2 = new LinkedList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		
		l2.remove(Integer.valueOf(10));
		System.out.println(l2);
		


	
	}

}

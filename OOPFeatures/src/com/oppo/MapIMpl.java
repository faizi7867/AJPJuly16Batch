package com.oppo;

import java.util.*;
import java.util.Map.Entry;

public class MapIMpl {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> empRecord = new HashMap<>();
		empRecord.put(110, "Ramesh");
		empRecord.put(102, "Ganesh");
		empRecord.put(103, "Dinesh");
		empRecord.put(104, "Ramesh");
		empRecord.put(104, "rehan");
		empRecord.put(104, "faisal");

		System.out.println(empRecord.size());
//
//		System.out.println("welcome " + empRecord.get(102));
//		System.out.println(empRecord);
//		System.out.println(empRecord.values());
//		
//		
//	for(	var emp:empRecord.entrySet())
//
//{
//		System.out.println(emp.getKey());
//		System.out.println(emp.getValue());
//}
////
//
//		System.out.println(empRecord.firstKey());
//		System.out.println(empRecord.ceilingKey(0));
	}

}

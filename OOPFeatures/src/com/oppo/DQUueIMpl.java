package com.oppo;

import java.util.*;

public class DQUueIMpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("tarun");
		dq.addLast("aachal");
		dq.add("Bhawna");
		dq.addFirst("Farhan");
		dq.addFirst("kunal");
		dq.add("Farhan");
		
		System.out.println(dq);
		
		dq.removeLast();
		System.out.println(dq);
		String [] names = {"aa","aa","bb","cc"};
//		System.out.println(Arrays.asList(names));
//		HashSet uniqnames = new HashSet<String>();
//		for(String name:names)
//		{
//			uniqnames.add(name)	;
//		}
//		System.out.println(uniqnames);
		
//		HashSet<String> hs = new HashSet<String>(Arrays.asList(names));
//		System.out.println(hs);
		
		HashSet<String> hs3 = new HashSet<String>();
		Collections.addAll(hs3, names);
		System.out.println(hs3);
		
	}
	

}

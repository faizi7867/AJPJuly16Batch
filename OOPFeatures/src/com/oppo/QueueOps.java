package com.oppo;
import java.util.*;
public class QueueOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> tq = new LinkedList<Integer>();
//		tq.add(10);
//		tq.add(5);
//		tq.offer(6);
//		tq.add(5);
//		tq.add(12);
//		
//		System.out.println(tq.poll());
//		System.out.println(tq);
//		
//
//		tq.remove();
//		System.out.println(tq);
//
//		System.out.println(tq.peek());
//		System.out.println(	tq.element());
	StringBuilder sb = new StringBuilder();
	sb.append("rahavendra rammss");
	System.out.println(sb.capacity());
		
		Queue<String> list = new PriorityQueue<String>(new MyComparator());
	
		list.add("Raman");  //5
		list.add("faisal");  //6
		list.add("raghavendra");  //11
		list.add("ali"); //3
		list.add("Ashwini"); //7
		System.out.println(list.size());
		
		while(!list.isEmpty())
		{
			System.out.println(list.poll());
		}
		
		
		
	}

}

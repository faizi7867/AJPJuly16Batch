package com.oppo;
import java.util.*;

public class StackExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.add(10);s.push(20);s.add(30);s.add(40);
		System.out.println(s);
		s.pop();
		System.out.println(s.search(200));
		System.out.println(s.peek());
	
		while(!s.empty())
		{
			s.pop();
		}
		System.out.println(s);
		
		System.out.println(s.empty());

	}

}

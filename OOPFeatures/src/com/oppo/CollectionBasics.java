package com.oppo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionBasics {
	public static void main(String[] args) {
//		List<String> l1 = new ArrayList<String>();
//		l1.add("1");
//		l1.add("2");
//		l1.add("1");
//		
//		l1.remove("1");
//		System.out.println(l1);
//		List<Integer> l2 = new ArrayList<Integer>();
//		l2.add(10);
//		l2.add(20);
//		l2.add(30);
//		
//		l2.remove(0);
//		System.out.println(l2);
		List<String> listName = new ArrayList<String>();
		listName.add("john");
		listName.add("steave");
		listName.add("daniel");
		System.out.println(listName);
		Collections.sort(listName,Collections.reverseOrder());
		System.out.println(listName);
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		
		
		for(int i = 0 ; i < numbers.size(); i ++)
		{
			System.out.println(numbers.get(i));
		}
		
		
		System.out.println("----------------------------");
		for(int i :numbers)
		{
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		ListIterator it = listName.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("-----------------------");
		
		ListIterator it2 = listName.listIterator(listName.size());
		while (it.hasPrevious()) {
			System.out.println(it.previous());
			
		}
		
		
		List<Student2> studentList   =  new ArrayList<Student2>();
		
		Student2 s1 = new Student2(1, "Yogesh","yogesh@gmail.com");
		
		studentList.add(s1);
		
		
		Student2 s2 = new Student2(1, "Amit", "Amit@gmail.com");
		studentList.add(s2);
		System.out.println(studentList);
		Iterator it4 = studentList.iterator();
		while(it4.hasNext())
		{
			System.out.println(it4.next());
		}
	
		for(Student2 s:studentList) {
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.email);
			System.out.println("-------------------");
		}
				
		
		
	}

}
class Student2
{
	int id;
	String name;
	String email;
	public Student2(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	  public String toString() {
	        return "Student2{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                '}';
	    }	

}




class Gen<T> {
	public void add(T a, T b) {

	}
}

class MyGen<T> {
	T obj;

	void add(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

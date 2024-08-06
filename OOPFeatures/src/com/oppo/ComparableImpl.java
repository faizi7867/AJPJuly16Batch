package com.oppo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableImpl {

	public static void main(String[] args) {
//			Student  s1=new Student(4, "rajesh", 10);
//			Student  s2=new Student(1, "rehan", 20);
//			Student  s3=new Student(2, "amit", 16);
//			Student  s4=new Student(5, "sumit", 15);
//			Student  s5=new Student(6, "piyush", 9);
//			Student  s6=new Student(3, "praveen", 21);
//			Set<Student>  studentlist = new TreeSet<>();
//			studentlist.add(s1);
//			studentlist.add(s2);
//			studentlist.add(s3);
//			studentlist.add(s4);
//			studentlist.add(s5);
//			studentlist.add(s6);
//			
//			System.out.println(studentlist);
		
		String x = "apple";
		String y = "apples";
		Integer i = 10;
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(i.hashCode());
	} 

}
class Student implements Comparable<Student>
{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " - " + this.name + " - " + this.age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo( o.name);
	}
	
}

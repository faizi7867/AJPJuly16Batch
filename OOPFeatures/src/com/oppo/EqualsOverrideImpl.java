package com.oppo;

import java.util.HashSet;
import java.util.Objects;

public class EqualsOverrideImpl {
	public static void main(String[] args) {
		HashCodeCheck first = new HashCodeCheck("a", "first");
		HashCodeCheck second = new HashCodeCheck("a", "first");
		System.out.println(first.hashCode());
		System.out.println(second.hashCode());
		
		
		System.out.println(first.equals(second)); // true;
		HashSet <HashCodeCheck> test = new HashSet <HashCodeCheck> ();
		test.add(first);
		test.add(second); 
		System.out.println(test.size()); // It will be 1.

	}
}

class Person {
	int id;
	String name;
	int age;

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

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Person p = (Person) obj;
		return id == p.id && age == p.age && Objects.equals(name, p.name);
	}
}

class HashCodeCheckw {
	private final String importantField;
	private final String anotherField;

	public HashCodeCheck(final String equalField, final String anotherField) {
		this.importantField = equalField;
		this.anotherField = anotherField;
	}

//We have written hascode() method with user define logic
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((importantField == null) ? 0 : importantField.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(final Object obj) {
//		if (this == obj) // here checking object’s reference
//			return true;
//		if (obj == null) // checking object is null or not
//			return false;
//		if (getClass() != obj.getClass()) // checking both are from same class or not
//			return false;
//		// fetching hashcode()
//		final HashCodeCheck other = (HashCodeCheck) obj;
//		return Objects.equals( importantField, other.importantField) && Objects.equals(anotherField, other.anotherField);
//	}
}

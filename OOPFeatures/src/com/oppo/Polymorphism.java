package com.oppo;

public class Polymorphism
{
	public static void main(String[] args)
	{
	
		
		Human obj = new Child();
		obj.eat();
	}
}



class Human{
public void eat()
{
System.out.println("Human is eating");
}
}
class Boy extends Human
{
@Override
public void eat()
{
System.out.println("Boy is eating");
}

}

class Child extends Boy
{

}

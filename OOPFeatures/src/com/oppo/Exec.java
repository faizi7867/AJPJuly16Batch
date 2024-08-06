package com.oppo;

public class Exec {

	public static void main(String[] args) {
//		
//		MountainBike mb  =new MountainBike(6, 50,10);
//		mb.speedUp(30);
//		System.out.println(mb);
		
		Printable ip = new Printable();
		int res = ip.add(30, 40);
		System.out.println(res);
		int res2 = ip.division(10,2);
		System.out.println(res2);
		
		IM1 i1 = (a,b) ->
		{
			return a + b;
		};
		System.out.println(i1.add(10, 20));
		
		
		ISpeak is = () ->{System.out.println("i am speaking");};
		
		is.speak();
	}
	
}

class A{
	public int y = 10;
			
}

class B extends A{
	B()
	{
		this("abc");
		System.out.println("first constructor");
	}
	B(int a){
		this();
		System.out.println("second constructor");
		
	}
	B(String x){
		System.out.println("third constructor");

	}
	
	public int x = 30;
	public int y = 22;
	
	public void display(int x)
	{
		
		System.out.println(this.x +super.y);
	}
}
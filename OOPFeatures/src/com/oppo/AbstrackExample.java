package com.oppo;

public class AbstrackExample {
 public static void main(String[] args) {
	 
	 Rectangle r = new Rectangle();
	 r.m1();
	 r.draw();

	 
	 
	
}	

}


 abstract class Shape
{
	 
	public abstract void draw() ;
	public abstract void clear(int x);
	public  void m1() {
		System.out.println("something is getting printed");
	}
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
}
 
 class Rectangle extends Shape
 {

	@Override
	public void draw() {
		System.out.println("drawing a rectangle");
		
	}
	public void clear()
	{
		
	}
	 
 }
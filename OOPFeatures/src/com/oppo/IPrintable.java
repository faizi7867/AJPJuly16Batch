package com.oppo;

 interface IPrintable {
	public  int x= 10;
	public static   int y = 20;

	void m4();
	int add(int num1,int num2);
	int sub (int x, int y);

}


 interface IWritable
{
	int multiply(int a,int b);
	default int division(int a,int b)
	{
		return 0;
		
	}
}

@FunctionalInterface
interface IM1{
	int add(int x , int y);
	
	
}


@FunctionalInterface
interface ISpeak{
	void speak();
}






























class Printable implements IPrintable,IWritable
{

	@Override
	public void m4() {
		System.out.println("printing");
		
	}

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}
	@Override
	public int division(int a,int b)
		{
			return a / b;
			
		
	}
	
}

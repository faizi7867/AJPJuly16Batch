package com.oppo;

import java.util.*;

public class FlowControl {
	
	public void details()
	{
			int x = 13;
			if(x >= 100)
			{
				System.out.println("hii");
			}
			else
			{
				System.out.println("bye");
			}
	}
	
	public String getDayName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day NO : ");
		int dayno = sc.nextInt();
		if(dayno == 1)
		{
			System.out.println("MOnday");
			return "M";
		}
		else if(dayno == 2)
		{
			System.out.println("Tuesday");
			return "T";
		}
		else if(dayno == 3)
		{
			System.out.println("Wednesday");
			return "W";
		}
		else if(dayno == 4)
		{
			System.out.println("Thursday");
			return "T";
		}
		else if(dayno == 5)
		{
			System.out.println("Friday");
			return "F";
		}
		else if(dayno == 6)
		{
			System.out.println("Saturday");
			return "S";
		}
		else if(dayno == 7)
		{
			System.out.println("Sunday");
			return "S";
		}
		else
		{
			return "0";
		}
		
	}

	public String getDayNameUsingSwitch()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day NO : ");
		int dayno = sc.nextInt();
		switch(dayno)
		{
		case 1:
			return("Monday");

			
		case 2:
			return("Monday");
		case 3:
			return("Monday");
		case 4: 
		case 5:
		case 6:
		case 7:
			return("Monday");
			
		
		
		}
		return "0";
		
	}
	
	
	public void checkVowel()
	{
		char c = 'e';
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'  )
		{
			System.out.println("its a vowel");
		}
		else
		{
			System.out.println("its a consonant");
		}

	}
}

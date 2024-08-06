package com.oppo;

public class SingleNumber {
	 public  int getSingleDigitSum(int number){
		 while(number>9){
		 number= sumofDigits(number);}
		 return number;
		 }
		 public  int sumofDigits(int number){
		 int sum=0;
		 while(number>0){
		 sum+=number%10;
		 number /= 10;
		 }
		 return sum;
		 }
		 
}

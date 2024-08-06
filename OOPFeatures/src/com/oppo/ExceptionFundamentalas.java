package com.oppo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionFundamentalas {
public static void main(String[] args) {

	AgeValidator validator=new AgeValidator();
	int age = 15;
try {
		validator.validateAge(age);
}
catch (InvalidAgeException e) {
	// TODO: handle exception
	System.out.println(e.getMessage());
}
	//try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Anudp\\Desktop\\AJP BATCH 16 July\\OOPFeatures\\src\\input.txt"))) {
//String line;
//while ((line = reader.readLine()) != null) {
//System.out.println(line);
//}
//} catch (IOException e) {
//System.out.println("Error reading the file: " + e.getMessage());
//}
}
}


class AgeValidator {
public void validateAge(int age) throws InvalidAgeException
{
if (age < 18) {
throw new InvalidAgeException("Age must be 18 or above sd sd asd asd sad.");
}
// If age is valid, the method continues execution normally.
}
}

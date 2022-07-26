package com.sample;

import java.util.Scanner;

public class MyDetails {
	
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your Name : ");
	
	String name=sc.next();
	
	System.out.println("Hello,"+name);
	
	System.out.println("Enter your Age: ");
	
	sc.nextInt();
	
	System.out.println("Ok");
	
	System.out.println("Enter your Salary: ");
	
	sc.nextFloat();
	
	System.out.println("Great");

}
	
	
}

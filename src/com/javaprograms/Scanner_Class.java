package com.javaprograms;

import java.util.Scanner;

public class Scanner_Class {
	
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("What is your Name???");
		
		String name = scan.nextLine();
		
		System.out.println("Hello " +name);
		
		System.out.println("What is your Age???");
		
		int age = scan.nextInt();
		
		System.out.println("Your Age is: " +age);
		
		System.out.println("What is your Salary???");
		
		float salary=scan.nextFloat();
		
		System.out.println("Your Salary :" +salary);
		
		boolean yes;
		
		System.out.println("Laptop is Provided??");
		yes=scan.nextBoolean();
		
		System.out.println(yes);
		
		if(yes)
			System.out.println("Laptop is Given");
		else
			System.out.println("Laptop is not Provided");
		
		
		
		
	}

}

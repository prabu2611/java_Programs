package com.javaprogramss;
import java.util.Scanner;

public class Palindrom_String {
	
	public static void main(String[] args) {
		
		
		String a,b="";
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the Word");
		
		a=s.nextLine();
		int n=a.length();
		
		for (int i = n-1; i >=0; i--) {
			
			b=b+a.charAt(i);
			
		}
		if(a.equalsIgnoreCase(b)) {
			
			System.out.println("The Given String is Palindrom");
		}
		else {
			System.out.println("The Given String is not Palindrom");
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}

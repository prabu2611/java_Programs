package com.javaprogramss;
import java.util.Scanner;

class Remove_Char {

	public static void main(String[] args) {
		char cha;
		Scanner p = new Scanner(System.in);
		System.out.print("Enter any char : ");
		
		cha = p.next().charAt(0);
		
		if ((cha >= 'a' && cha <= 'z') || (cha >= 'A' && cha <= 'Z')) {
			System.out.println(cha + " is Alphabet");
			
		} else if (cha >= '0' && cha <= '9') {
			System.out.println(cha + " is Digit");
		} 
		else {
			System.out.println(cha + " is Special Charcter");
		}
	}
}

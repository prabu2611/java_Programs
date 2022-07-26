

import java.util.Scanner;

public class Chatbox {
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter your Name:");
		
		s.next();//prabu
		
		System.out.println("Enter your Native:");
		
		s.nextLine(); //" "
		
		s.nextLine();  
		
		System.out.println("Hello ");
		
		System.out.println();
		
		System.out.println("Enter Your Age:");
		
		s.nextInt();
		
		System.out.println("Ok");
		
		System.out.println();
		
		System.out.println("Enter Your Salary");
		
		s.nextFloat();
		
		System.out.println("Great");
	}

}

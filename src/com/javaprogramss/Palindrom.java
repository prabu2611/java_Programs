package com.javaprogramss;

public class Palindrom {
	public static void main(String[] args) {
	
		int n=153;
		int i,j=0;
		int a=n;
		
		while(a>0) {
			
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
		if(n==j) {
			System.out.println("It is a palindron Number");
		}
		else {
			System.out.println("It is a Reverse Number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

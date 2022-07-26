package com.javaprograms;

public class Method {
	
	public static void sayHi() {
		System.out.println("Welcome to Java");
	}
	
	public static int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println("Hello");
		sayHi();
		System.out.println("The Sum is:" +sum(4,7));
	}
}

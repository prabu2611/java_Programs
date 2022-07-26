package com.sample;

public class Sum {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	
	public static double add(double x,double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(add(6,9.7));
		System.out.println(add(8, 4, 12));
		System.out.println(add(88,7));
	}
	
	
	


}

package com.javaprograms;

public class Method_Overloading {
	
	static int max(int a,int b) {
	return  a>b?a:b;
	}	
	
	static double max(double a,double b) {
		return a>b?a:b; 
	}
	static char max(char a,char b) {
		return a>b?a:b;
	}
	
	public static void main(String[] args) {
		System.out.println(max (7,23));
		System.out.println(max (6.7,8.8));
		System.out.println(max ('p','g'));
	}

}

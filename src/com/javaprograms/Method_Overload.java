package com.javaprograms;

public class Method_Overload {
	
	public void addMethod() {
		System.out.println("addition");
		
	}
	
	public static int addMethod(int a,int b) {
		return a+b;
	}
	
	public static double addMethod(double x,double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		int add=addMethod(4,6);
		double sum=addMethod(4,8);
		System.out.println("int :"+add);
		System.out.println("double:"+sum);
		
		
		
	}

}

package com.sample;

public class Variablessss {
	
	int b=20;//class or instance variable
	
	static int c=30;
	
	
	public void localVariables() {
		
		int a=10;//local variable
		
		System.out.println("Value of Local Variable :  "+a);
	}
	
	public static void main(String[] args) {
		Variablessss p=new Variablessss();
		p.localVariables();
		
		System.out.println("Value of Instance Variable: "+p.b);
		System.out.println("Value of Static Variable:  "+Variablessss.c);
	}
	
	

}

package com.sample;

public class Addition_Ex extends Addition{
	
	
	@Override
	public int addMethod(int a, int b) {
		System.out.println("Welcome");
	  return a+b;
	}
	
	public static void main(String[] args) {
		
		Addition_Ex add=new Addition_Ex();
		Addition add1=new Addition();
		
		System.out.println(add.addMethod(6, 8));
		System.out.println(add1.addMethod(7, 9));
	}

}

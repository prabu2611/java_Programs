package com.sample;

public class Const {
	
	int num;
	String name;
	
	public Const() {
		name="Prabu";
		num=1000;
	}
	
	
	
	
	public static void main(String[] args) {
		Const c=new Const();
		System.out.println("My Details:"+"\n"+c.name+"\n"+c.num);
		
		
	}
	
}
package com.sample;

public class ParaMet {
	
	int id;  
	String name;
	
	
	public ParaMet(String name,int id) {
		this.name=name;
		this.id=id;
	
	}
	
	public static void main(String[] args) {
		ParaMet p=new ParaMet("Prabu",1000);
		
		System.out.println("My Details:");
		
		System.out.println("Name :"+p.name);
		
		System.out.println("ID :"+p.id);

				
	}
}

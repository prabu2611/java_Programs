package com.sample;

public class Para {
	
	int id;
	String name;
	
	public Para(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	
	public static void main(String[] args) {
		Para p=new Para("prabu",26);
		
		System.out.println("My Name: "+p.name+"\n"+"My age:"+p.id);
	}










}



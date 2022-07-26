package com.javaprogramss;

public class Mail_Check {
	
	
	public static void main(String[] args) {
		
		String s= "green_tech@gmail.com";
		
		String[] s1 = s.split("@");
		
		System.out.println(s1[0]);
		
		String replaceAll = s1[0].replaceAll("[^a-zA-Z0-9_.]", "");
		
		System.out.println(replaceAll);
		
		System.out.println(s1[0].equals(replaceAll));
		
		
		
		
		
		
		
		
	}

}

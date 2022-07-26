package com.sample;

public class VariableTypes {
	int myVariable = 20;
	static int data = 30;

	public void localVariable() {
		int a;
		a = 10;
		System.out.println("Value of local variable: " + a);

	}

	public static void main(String args[]) {
		VariableTypes obj = new VariableTypes();
		obj.localVariable();
		System.out.println("Value of instance variable: " + obj.myVariable);
		System.out.println("Value of static variable: " + VariableTypes.data);
	}
}

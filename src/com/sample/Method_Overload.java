package com.sample;

public class Method_Overload {

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a) {
		return a;
		
	}
		
		public int sum(int a,int b,int c) {
			return a+b+c;
		}

	

	public static void main(String[] args) {
		Method_Overload s = new Method_Overload();
		System.out.println(s.sum(6, 9));
		System.out.println(s.sum(9));
		System.out.println(s.sum(6, 7, 5));

	}
}

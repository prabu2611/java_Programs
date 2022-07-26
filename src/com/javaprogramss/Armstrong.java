package com.javaprogramss;

public class Armstrong {

	public static void main(String[] args) {

		// 153=1^3+5^3+3^3=153

		int n = 370;
		int i, j = 0;
		int a = n;

		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (n == j) {
			System.out.println("It is an amstrong number");
		}else {
			System.out.println("It is not an armstrong number");
		}
		
	}

}

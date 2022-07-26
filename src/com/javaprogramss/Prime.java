package com.javaprogramss;

public class Prime {
	public static void main(String[] args) {

		int count = 0;

		for (int n = 1; n <= 100; n++) {

			boolean free=true;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					free=false;
				}
			}

				if (free==true) {
					System.out.println(n+" is a prime");
					count++;
				}
				

		}	
			System.out.println("Total prime count: "+count);
		}
}





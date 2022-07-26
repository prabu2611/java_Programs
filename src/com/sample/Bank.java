package com.sample;

public class Bank implements Loan{

	@Override
	public void personalLoan() {
		System.out.println("15%");
		
	}

	@Override
	public void carLoan() {
		System.out.println("10%");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("8%");
		
	}
	
	
	public static void main(String[] args) {
		Bank b=new Bank();
		b.personalLoan();
		b.carLoan();
		b.homeLoan();
	}

}

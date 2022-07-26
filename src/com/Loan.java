package com;

public class Loan extends Bank {

	@Override
	public void personLoan() {
	
		System.out.println("Your Personal Loan interest is:20%");
		
	}
	
	public static void main(String[] args) {
		
		Loan l=new Loan();
		
		l.homeLoan();
		l.carLoan();
		l.personLoan();
	}

}

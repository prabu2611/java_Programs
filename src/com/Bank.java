package com;

public abstract class Bank {

	public abstract void personLoan(); //abstract method

	public void homeLoan() {
		System.out.println("12%"); //non abstract method

	}
	public void carLoan() {
		System.out.println("15%");
	}

}

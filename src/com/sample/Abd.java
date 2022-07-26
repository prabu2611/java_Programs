package com.sample;

public class Abd extends Abc{

	@Override
	public void perosonalLoan() {
		System.out.println("15%");
		
	}
	
	public static void main(String[] args) {
		
		Abd loan=new Abd();
		loan.perosonalLoan();
		loan.homeLoan();
		loan.carLoan();
		
	}

	
	

}

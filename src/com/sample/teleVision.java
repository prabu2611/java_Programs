package com.sample;

public class teleVision extends Cinima {
	
	
	@Override
	public void movieTime() {
		System.out.println("Ponniyin Selvan Serial");
	}
	
	public static void main(String[] args) {
		
		Cinima c=new Cinima();
		teleVision t =new teleVision();
		
		c.movieTime();
		t.movieTime();
	}
	


}

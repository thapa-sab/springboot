package com.rab3tech;

public class Division {

	private int a;
	
	
	public int divide( int b) {
		
		if(a % 2 != 0) {
			throw new ArithmeticException(" a should be even number");
		}
		else {
			b = a / 2;	
		}
		return b;
	}
	
}

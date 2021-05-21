package com.TestNG_10Am_Batch;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	private void zeroError() {

		int a  = 10;
		
		System.out.println(a/0);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

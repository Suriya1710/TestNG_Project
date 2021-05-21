package com.TestNG_10Am_Batch;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	
	@Test
	@Parameters({"username", "password"})
	private void credentials(@Optional("Starc")String username , int password) {

		System.out.println("username : "+username);
		
		System.out.println("password : "+password);
		
	}
	
	
	

}

package com.TestNG_10Am_Batch;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test(timeOut = 2000)
	private void navigateToPage() throws Throwable {

		
		System.out.println("Click The Login Btn");

		Thread.sleep(1000);

		System.out.println("Navigate To Home page");

	}

}

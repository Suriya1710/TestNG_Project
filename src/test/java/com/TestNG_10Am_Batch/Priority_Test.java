package com.TestNG_10Am_Batch;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(priority = -5)
	private void laptopSearch() {

		System.out.println("Laptop Search");

	}

	@Test(priority = -1)
	private void mobileSearch() {

		System.out.println("Mobile Search");

	}
	
	@Test(priority = -1)
	private void earphonesSearch() {

		System.out.println("Earphones Search");

	}
	
	
	@Test(priority = -55)
	private void bookSearch() {

		System.out.println("Book Search");

	}
	

}

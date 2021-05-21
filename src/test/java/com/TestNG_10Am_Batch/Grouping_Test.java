package com.TestNG_10Am_Batch;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups = "Electronics")
	private void laptopSearch() {

		System.out.println("laptop Search");

	}

	@Test(groups = "Electronics")
	private void mobileSearch() {

		System.out.println("Mobile Search");

	}

	@Test(groups = "Education")
	private void bookSearch() {

		System.out.println("Book Search");

	}

	@Test(groups = "Education")
	private void novelSearch() {

		System.out.println("Novel Search");

	}

	@Test(groups = "Social Media")
	private void whatsapp() {

		System.out.println("WhatsApp");

	}

	@Test(groups = "Social Media")
	private void fb() {

		System.out.println("Facebook");

	}

}

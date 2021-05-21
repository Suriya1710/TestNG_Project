package com.TestNG_10Am_Batch;

import org.testng.annotations.Test;

public class Dependency_Test {

	@Test
	private void XYZ() {

		System.out.println("Mobile");

	}

	@Test(dependsOnMethods = "XYZ")
	private void laptop() {

		System.out.println("laptop");

	}

	@Test
	private void offer() {

		System.out.println("Offer");

	}

}

package com.TestNG_10Am_Batch;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test
	private void browserLaunch() {

		System.out.println("Browser Launch");

	}

	@Test(invocationCount = 3)
	private void refresh() {

		System.out.println("Refresh");

	}

	@Test
	private void url() {

		System.out.println("Url");

	}

}

package com.TestNG_10Am_Batch;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Test {

	@Test(dataProvider = "test_Data")
	private void credentials(String username, int password) {

		System.out.println("username : " + username);

		System.out.println("password : " + password);

	}

	@DataProvider()
	private Object[][] test_Data() {

		return new Object[][] {

				{ "Smith", 123 }, 
				{ "Watson", 4355 }, 
				{ "John", 345 }

		};

	}

}

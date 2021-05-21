package com.TestNG_10Am_Batch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {

	@Test
	private void credentials() {

		String actual = "Smith";

		String expected = "Starc";

		Assert.assertEquals(actual, expected);

	}

	@Test
	private void credentials1() {

		String actual_Username = "Smith123";

		String expected_Username = "Starc123";

		Assert.assertEquals(actual_Username, expected_Username);

	}

}

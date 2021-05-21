package com.TestNG_10Am_Batch;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void credentials() {
		
		
		String actual = "Smith";
		
		String expected  = "Starc";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);
		
		System.out.println("process completed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		String actual = "Starc";
//
//		String expected = null;
//
//		// Assert.assertNull(actual); // ----> it fails
//
//		Assert.assertNotNull(actual);
//
//		System.out.println("Process Completed");

	}

}

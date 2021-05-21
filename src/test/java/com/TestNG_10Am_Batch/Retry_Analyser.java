package com.TestNG_10Am_Batch;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyser implements IRetryAnalyzer {

	int count = 1;
	int limit = 5;
	
	public boolean retry(ITestResult result) {

		if (count <= limit) {

			count++;

			return true;

		}

		return false;
	}

}

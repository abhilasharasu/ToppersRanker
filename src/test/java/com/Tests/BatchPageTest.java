package com.Tests;

import com.toprankers.automation.Baseclass;
import Pages.BatchPage;

import org.testng.Assert;

import utils.IRetryAnalyser;

import org.testng.annotations.Test;
import java.time.Duration;

public class BatchPageTest extends Baseclass {

	@Test(retryAnalyzer = IRetryAnalyser.class) // Use the RetryAnalyzer
	public void verifyBatchPageElements() {
		driver.get("https://www.toprankers.com/clat-2027-achievers-pclatinum-batch-ap603-by-legaledge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Check if the page returns a 404 error
		if (driver.getTitle().contains("404") || driver.getPageSource().contains("404 Not Found")) {
			Assert.fail("Page returned a 404 error");
		}

		BatchPage batchPage = new BatchPage(driver);
		Assert.assertTrue(batchPage.isVideoTabPresent(), "Video tab is not displayed");
		Assert.assertTrue(batchPage.isTestTabPresent(), "Test tab is not displayed");
		Assert.assertTrue(batchPage.isStudyMaterialTabPresent(), "Study Material tab is not displayed");
		Assert.assertTrue(batchPage.isAssignmentTabPresent(), "Assignment tab is not displayed");
		Assert.assertTrue(batchPage.isPracticeTabPresent(), "Practice tab is not displayed");
	}
}

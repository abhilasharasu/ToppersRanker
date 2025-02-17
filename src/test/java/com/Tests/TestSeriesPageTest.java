package com.Tests;

import com.toprankers.automation.Baseclass;
import Pages.TestSeriesPage;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeriesPageTest extends Baseclass {

    @Test
    public void verifyTestSeriesPageLoads() {
        
		driver.get("https://www.toprankers.com/cuet-mock-test-series");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        TestSeriesPage testSeriesPage = new TestSeriesPage(driver);
        Assert.assertTrue(testSeriesPage.isTestSeriesDisplayed(), "Test series list is not displayed");
        // //
    }
}

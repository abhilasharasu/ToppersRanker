package com.Tests;

import com.toprankers.automation.Baseclass;
import Pages.Homepage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Baseclass {
	
	 @Test
    public void verifyHomePageTitle() {
        WebDriver driver = null;
		driver.get("https://www.toprankers.com");
        Homepage homePage = new Homepage();
        String expectedTitle = "Toprankers - Best Coaching Platform";
        Assert.assertEquals(homePage.getPageTitle(), expectedTitle, "Home Page title doesn't match");
    }
}
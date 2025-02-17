package com.Tests;

import com.toprankers.automation.Baseclass;
import Pages.BatchListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BatchListPageTest extends Baseclass{

    @Test
    public void verifyBatchListPageLoads() {
        driver.get("https://www.toprankers.com/clat-online-coaching");
        BatchListPage batchListPage = new BatchListPage(driver);
        Assert.assertTrue(batchListPage.isBatchListDisplayed(), "Batch list is not displayed");
    }

    @Test
    public void verifyBatchCount() {
        driver.get("https://www.toprankers.com/clat-online-coaching");
        BatchListPage batchListPage = new BatchListPage(driver);
        Assert.assertTrue(batchListPage.getBatchCount() > 0, "No batches found on the page");
    }
}
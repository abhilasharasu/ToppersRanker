package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BatchListPage {
    private WebDriver driver;
    private By batchCards = By.xpath("//div[h2[contains(text(),'CLAT 2026 Platinum (Year Long )')]]");

    public BatchListPage(Object driver2) {
        this.driver = (WebDriver) driver2;
    }

    public int getBatchCount() {
        List<WebElement> batches = driver.findElements(batchCards);
        return batches.size();
    }

    public boolean isBatchListDisplayed() {
        return !driver.findElements(batchCards).isEmpty();
    }
}
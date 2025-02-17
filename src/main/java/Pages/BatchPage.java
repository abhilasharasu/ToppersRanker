package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BatchPage {
    private WebDriver driver;
    private By videoTab = By.id("video-tab");
    private By testTab = By.id("test-tab");
    private By studyMaterialTab = By.id("study-material-tab");
    private By assignmentTab = By.id("assignment-tab");
    private By practiceTab = By.id("practice-tab");

    public BatchPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isVideoTabPresent() {
        return driver.findElement(videoTab).isDisplayed();
    }

    public boolean isTestTabPresent() {
        return driver.findElement(testTab).isDisplayed();
    }

    public boolean isStudyMaterialTabPresent() {
        return driver.findElement(studyMaterialTab).isDisplayed();
    }

    public boolean isAssignmentTabPresent() {
        return driver.findElement(assignmentTab).isDisplayed();
    }

    public boolean isPracticeTabPresent() {
        return driver.findElement(practiceTab).isDisplayed();
    }
}
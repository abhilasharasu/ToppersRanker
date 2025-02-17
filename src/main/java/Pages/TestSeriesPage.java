package Pages;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class TestSeriesPage {
	    private WebDriver driver;
	    private By testList = By.xpath("//div[contains(text(),'Free')]");

	    public TestSeriesPage(Object driver2) {
	        this.driver = (WebDriver) driver2;
	    }

	    public boolean isTestSeriesDisplayed() {
	        return !driver.findElements(testList).isEmpty();
	    }
	}




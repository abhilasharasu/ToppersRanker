package Pages;


import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;

    public void HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}

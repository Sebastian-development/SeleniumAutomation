package demoqaPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
    private WebDriver driver;

    public WebDriver getDriver() {

        return driver;
    }

    public void setDriver(WebDriver driver) {

        this.driver = driver;
    }

    public Browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebastian corral\\Documents\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void loadURL(String url) {
        driver.get(url);
       // WebDriverWait wait = new WebDriverWait(driver, 30);
        //wait.until(ExpectedConditions.urlToBe("https://www.demoqa.com"));
    }
    public void tearDown() {
        driver.quit();
    }
}

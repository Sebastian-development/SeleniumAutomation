package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public WebDriver driver;
    @FindBy(how = How.CLASS_NAME, using = "coaching-tip_layer__389Rm")
    private WebElement tipWindow;
    @FindBy(how = How.CLASS_NAME, using = "search-bar-desktop_input__33Tbk")
    private WebElement searchBar;
    @FindBy(how = How.XPATH, using = "//button[@data-automation-id='search-icon']")
    private WebElement buttonSearch;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void closeTipWindow(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(tipWindow));
        tipWindow.click();
    }
    public void searchIphone(String nameCellPhone){
        searchBar.sendKeys(nameCellPhone);
    }
    public void clickSearch(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(buttonSearch));
        buttonSearch.click();
    }
}

package walmart;

import demoqaPage.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPayPage {
    public WebDriver driver;
    @FindBy(how = How.CLASS_NAME, using ="guest-continue-formSubmit")
    private WebElement buttonContinueAsGuest;
    @FindBy(how = How.XPATH, using = "//div/img[@alt='2']")
    private WebElement iphoneImg;
    @FindBy(how = How.XPATH, using = "//div[@class='buy-now-button_buyNowBtnContainer__1a6Vo product-details_buyNowBtn__3hg_5']/button[text()='Comprar ahora']")
    private WebElement clickBuyNow;

    public BuyPayPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public BuyAsGuest buyNow(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(iphoneImg));
        iphoneImg.click();
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.elementToBeClickable(clickBuyNow));
        clickBuyNow.click();
        return new BuyAsGuest(driver);
    }
    }

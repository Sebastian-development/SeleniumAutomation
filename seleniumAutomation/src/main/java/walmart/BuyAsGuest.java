package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyAsGuest {
    public WebDriver driver;
    @FindBy(how = How.CLASS_NAME, using = "continue-button")
    private WebElement buttonContinueWithThePurshase;
    @FindBy(how = How.XPATH, using = "//div/button[@data-automation-id='guest-continue-formSubmit']")
    private WebElement buttonContinueAsGuest;
    @FindBy(how = How.XPATH, using = "//div/input[@data-automation-id='firstName']")
    private WebElement textBoxName;
    @FindBy(how = How.XPATH, using = "//div/input[@data-automation-id='lastName']")
    private WebElement textBoxlastName;
    @FindBy(how = How.XPATH, using = "//form[@data-automation-id='guest-Login']/div/input[@data-automation-id='email']")
    private WebElement textBoxEmail;
    public BuyAsGuest(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void buyAsGuest(){
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.elementToBeClickable(buttonContinueAsGuest));
        buttonContinueAsGuest.click();
    }
    public void fillName(String name){
        textBoxName.sendKeys(name);
    }
    public void fillLastName(String lastName){
        textBoxlastName.sendKeys(lastName);
    }
    public int randomNumber(){
        int number = (int)(Math.random()*10+1);
        return number;
    }
    public void fillEmail(String eMail){
        int random = randomNumber();
        textBoxEmail.sendKeys(random+eMail);
    }


}

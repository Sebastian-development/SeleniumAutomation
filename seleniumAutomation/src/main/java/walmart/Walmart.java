package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Walmart {
    public WebDriver driver;


    @FindBy(how = How.XPATH, using = "//div[@class='product-details_addToCartContainer__1mcG-']/div/button[text()='Agregar al carrito']")
    private WebElement buttonAddToCart;
    @FindBy(how = How.CLASS_NAME, using = "goToFullCartPage")
    private WebElement buttonSelectCart;
    @FindBy(how = How.CLASS_NAME, using = "continue-button")
    private WebElement buttonContinueWithThePurshase;
    @FindBy(how = How.CLASS_NAME, using = "guest-continue-formSubmit")
    private WebElement buttonContinueAsGuest;
    @FindBy(how = How.CLASS_NAME, using = "firstName")
    private WebElement textBoxName;
    @FindBy(how = How.CLASS_NAME, using = "lastName")
    private WebElement textBoxlastName;
    @FindBy(how = How.XPATH, using = "//form[@data-automation-id='guest-Login']/div/input[@type='email']")
    private WebElement textBoxEmail;
    @FindBy(how = How.XPATH, using = "//div/label[text()='Calle*']")
    private WebElement textBoxStreet;
    @FindBy(how = How.XPATH, using = "//div/label[text()='Núm. exterior*']")
    private WebElement textBoxOutdoorNumber;
    @FindBy(how = How.XPATH, using = "//div/label[text()='Código Postal* ']")
    private WebElement textBoxPostalCode;
   // @FindBy(how = How.CLASS_NAME.XPATH, using = "//div/label[text()='Código Postal* ']")
    //private WebElement textBoxPostalCode;
    @FindBy(how = How.CLASS_NAME, using = "0 0 40 40")
    private WebElement comboBoxNeighborhood;
    @FindBy(how = How.XPATH, using = "//select/option[@value='LOMAS DE CHAPULTEPEC']")
    private WebElement selectNeighborhood;
    @FindBy(how = How.XPATH, using = "//div/label[text()='Teléfono móvil*']")
    private WebElement textBoxCellNumber;
    @FindBy(how = How.XPATH, using = "//div/button[text()='Continuar a método de pago']")
    private WebElement buttonContinueToPaymentMethod;

    public Walmart(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    public void selectCart(){
        buttonSelectCart.click();
    }
    public void selectContinueWithThePurshase(){
        buttonContinueWithThePurshase.click();
    }
    public void buyAsGuest(){
        WebDriverWait wait2 = new WebDriverWait(driver, 30);
        wait2.until(ExpectedConditions.elementToBeClickable(buttonContinueAsGuest));
        buttonContinueAsGuest.click();
    }
}

package despegar;

import org.omg.PortableInterceptor.HOLDING;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Despegar {
    public WebDriver driver;
    @FindBy(how = How.XPATH, using = "//div/i[@title='Vuelos']")
    private WebElement buttonVuelos;
    @FindBy(how = How.XPATH, using = "//div/input[@placeholder='Ingresa desde dónde viajas']")
    private WebElement textBoxOrigenPlace;
    @FindBy(how = How.XPATH, using = "//ul/li/span/em[text()='Chihuahua'][1]")
    private WebElement selectChihuahua;
    @FindBy(how = How.XPATH, using = "//div/input[@placeholder='Ingresa hacia dónde viajas']")
    private WebElement textBoxDestinyPlace;
    @FindBy(how = How.XPATH, using = "//li/span[text()='Cancún, Quintana Roo, México']")
    private WebElement selectCancun;
    @FindBy(how = How.XPATH, using = "//div/input[@placeholder='Ida']")
    private WebElement textBoxDateaGo;
    @FindBy(how = How.XPATH, using = "//div/input[@placeholder='Ingresa hacia dónde viajas']")
    private WebElement textBoxDateBack;
    @FindBy(how = How.XPATH, using = "//div[@data-month='2021-02']/div/span/span[text()='2']")
    private WebElement selectCalendarOut;
    @FindBy(how = How.XPATH, using = "//div[@data-month='2021-02']/div/span/span[text()='8']")
    private WebElement selectCalendarBack;
    @FindBy(how = How.XPATH, using = "//div/a[@class='sbox-3-btn -primary -md sbox-search'][1]")
    private WebElement buttonSearch;
    @FindBy(how = How.XPATH, using = "//em/span[@class='flights-price']")
    private WebElement textPrize;


    public Despegar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnVuelos(){
        buttonVuelos.click();
    }
    public void fillOrigenPlace(String origenPlace){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(textBoxOrigenPlace));
        textBoxOrigenPlace.clear();

        textBoxOrigenPlace.sendKeys(origenPlace);

    }
    public void clickOptionChihuahua(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(selectChihuahua));
        selectChihuahua.click();
    }
    public void fillDestinyPlace(String destinyPlace){
        textBoxDestinyPlace.sendKeys(destinyPlace);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(selectCancun));
        selectCancun.click();
    }
    public void selectDateGoOut(){
        textBoxDateaGo.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(selectCalendarOut));
        selectCalendarOut.click();
    }
    public void selectDateBack(){
        textBoxDateBack.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(selectCalendarBack));
        selectCalendarBack.click();
    }
    public void clickSearch(){
        buttonSearch.click();
    }
    public String printPrizeFly(){
        String prize =(textPrize.getText());
        return prize;
    }


}

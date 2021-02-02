package pom.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    @FindBy(how = How.ID, using = "twotabsearchtextbox")
    private WebElement searchBox;
    String printerName;
    @FindBy(how = How.ID, using = "nav-search-submit-text")
    private WebElement searchOption;

    @FindBy(how = How.XPATH, using = "//a[contains(@href,'Triciclo')]/div/img")
    private WebElement clickImg;

    @FindBy(how = How.ID, using = "add-to-cart-button")
    private WebElement addToCart;

    @FindBy(how = How.CLASS_NAME, using = "a-color-price hlb-price a-inline-block a-text-bold")
    private WebElement printPrize;


    public GooglePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }
        public void sendTextToSearchBox(String text){

        searchBox.sendKeys(text);
        }

        public void clickSearch(){
           // System.out.println(searchOption.getText());
        searchOption. click();
        searchOption.

            //System.out.println(searchOption.getText());
    }

    public void clickProduct(){
        clickImg.click();


    }

    public void clickAddToCart(){
            //System.out.println(printPrize.getText());
        addToCart.click();
    }


}

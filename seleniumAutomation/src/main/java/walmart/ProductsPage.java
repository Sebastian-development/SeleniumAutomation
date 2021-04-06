package walmart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
    public WebDriver driver;
    @FindBy(how = How.XPATH, using = "//a[p[div[contains(text(),'iPhone SE 2 Apple 64 GB Negro')]]]")
    private WebElement linkArticleIphone;

    public ProductsPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void selectArticle(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(linkArticleIphone));
        String iphoneURL = linkArticleIphone.getAttribute("href");
        driver.get(iphoneURL);
    }
}

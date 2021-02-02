import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

public WebDriver driver;

    public Browser (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sebastian corral\\Documents\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }
//metodos
    public void loadURL (String url) {
        driver.get(url);
    }

    public void refreshBroswer(){
        driver.navigate().refresh();;
    }

    public void printPrize(String xpath){

        WebElement text = driver.findElement(By.xpath((xpath)));
       String prizeText =  text.getText();//
        System.out.println(prizeText);
    }
    /*public void sendText (String xpath,String text){
       WebElement inputBox = driver.findElement(By.xpath(xpath));
       inputBox.sendKeys(text);
       driver.
    }
    public void clickButton (String xpath){
        WebElement button = driver.findElement(By.xpath(xpath));
        button.click();
    }*/
}

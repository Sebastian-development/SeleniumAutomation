import demoqaPage.Browser;
import demoqaPage.DemoqaPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestDemoqaPage {
    private Browser browser;
    private DemoqaPage demoqaPage;
    //private WebDriver driver;
    @Before
    public void setUp(){
        browser = new Browser();
        browser.loadURL("https://www.demoqa.com");
        demoqaPage = new DemoqaPage(browser.getDriver());
        demoqaPage.clickInElements();
    }
    @Test
    public void testForm(){
        demoqaPage.clickTextBox();
        demoqaPage.fillUserName("Sebastian");
        demoqaPage.fillEmail("diegox4@hotmail.com");
        demoqaPage.fillCurrentAddress("Ciudad Cuauhtemoc");
        demoqaPage.fillPermanentAddress("Chihuahua, Mexico");
        demoqaPage.clickSubmitButton();
        List<WebElement> testElements = demoqaPage.getResults("//div[@id='output']/div/p");
        String name = testElements.get(0).getText();
        Assert.assertEquals("Name:Sebastian", name);
    }
    @Test
    public void testCheckBoxComponent(){
        demoqaPage.clickCheckBox();
        demoqaPage.clickCheckBoxHomme();
        String textHome =demoqaPage.printTextHomme();
        Assert.assertTrue(textHome.contains("home"));
    }
    @Test
    public void testRadioButtonYes(){
        demoqaPage.ClickOnRadioButton();
        demoqaPage.clickYesRadioButton();
        String radioButtonYes = demoqaPage.printTextYesRadioButton();
        Assert.assertTrue(radioButtonYes.contains("Yes"));
    }
    @Test
    public void testRadioButtonImpressive(){
        demoqaPage.ClickOnRadioButton();
        demoqaPage.clickImpressiveRadioButton();
        String radioButtonImpressive = demoqaPage.printImpressiveRadioButton();
        Assert.assertTrue(radioButtonImpressive.contains("Impressive"));
    }
    @Test
    public void testAllButtonsCanBeClicked(){
        List<WebElement> clicks = browser.getDriver().findElements(By.xpath("//div[@class='element-list collapse show']/ul/li"));
        for (int i = 0; i < clicks.size(); i++) {
            WebElement button = clicks.get(i);
            button.click();
            WebDriverWait wait = new WebDriverWait(browser.getDriver(), 30);
            //wait.until(ExpectedConditions.presenceOfElementLocated(button.find));
            Assert.assertTrue(button.getAttribute("class").contains("active"));
        }
        //demoqaPage.listBox();
      // Assert.assertEquals(9,s);
    }
    @Test
    public void testListButtons(){
        demoqaPage.getListWebElements("//div[@class='element-list collapse show']/ul/li");
       demoqaPage.listBoxElements(demoqaPage.getListWebElements("//div[@class='element-list collapse show']/ul/li"));
       String C = demoqaPage.listBoxElements(demoqaPage.getListWebElements("//div[@class='element-list collapse show']/ul/li"));
        Assert.assertTrue(C.contains("Text Box"));
        //Assert.assertEquals
    }

    @After
    public void closeBrowser(){
        browser.tearDown();
    }
}

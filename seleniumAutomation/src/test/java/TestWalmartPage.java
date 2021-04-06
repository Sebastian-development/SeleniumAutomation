import demoqaPage.Browser;
import org.junit.Test;
import walmart.HomePage;
import walmart.Walmart;

public class TestWalmartPage {
    private Browser browser;
    private HomePage homePage;

    public void setUpWalmartPage(){
        browser = new Browser();
        browser.loadURL("https://www.walmart.com.mx/inicio");
        homePage = new HomePage(browser.getDriver());
    }
    @Test
    public void homePage(){
        homePage.closeTipWindow();
        homePage.searchIphone("Iphone");
        homePage.clickSearch();//home page end

    }


}

import demoqaPage.Browser;
import despegar.Despegar;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import walmart.Walmart;
import org.junit.Before;

public class TestDespegar {
    public Browser browser;
    public Despegar despegar;
    @Before
    public void SetUp(){
        browser = new Browser();
        browser.loadURL("https://www.despegar.com.mx/");
        despegar= new Despegar(browser.getDriver());
    }
    @Test
    public void testSearchFly(){
        despegar.clickOnVuelos();
        despegar.fillOrigenPlace("Chihuahua");
        despegar.clickOptionChihuahua();
        despegar.fillDestinyPlace("Cancun,Quintana Roo,Mexico");
        despegar.selectDateGoOut();
        despegar.selectDateBack();
        despegar.clickSearch();
        String prize = despegar.printPrizeFly();

    }

}

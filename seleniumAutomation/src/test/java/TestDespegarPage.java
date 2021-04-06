import demoqaPage.Browser;
import despegar.DespegarPage;
import org.junit.Test;
import org.junit.Before;

public class TestDespegarPage {
    public Browser browser;
    public DespegarPage despegarPage;
    @Before
    public void SetUp(){
        browser = new Browser();
        browser.loadURL("https://www.despegar.com.mx/");
        despegarPage = new DespegarPage(browser.getDriver());
    }
    @Test
    public void testSearchFly(){
        despegarPage.clickOnVuelos();
        despegarPage.fillOrigenPlace("Chihuahua");
        despegarPage.clickOptionChihuahua();
        despegarPage.fillDestinyPlace("Cancun,Quintana Roo,Mexico");
        despegarPage.selectDateGoOut();
        despegarPage.selectDateBack();
        despegarPage.clickSearch();
        String prize = despegarPage.printPrizeFly();

    }

}

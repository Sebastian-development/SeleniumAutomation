package despegar;

import demoqaPage.Browser;

public class MainDespegar {
    public static void main(String [] args){
        Browser browser = new Browser();
        browser.loadURL("https://www.despegar.com.mx/");
        DespegarPage despegarPage = new DespegarPage(browser.getDriver());
        despegarPage.clickOnVuelos();
        despegarPage.fillOrigenPlace("Chihuahua");
        despegarPage.clickOptionChihuahua();
        despegarPage.fillDestinyPlace("Cancun,Quintana Roo,Mexico");
        despegarPage.selectDateGoOut();
        despegarPage.selectDateBack();
        despegarPage.clickSearch();



    }
}

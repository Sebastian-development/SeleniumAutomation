package despegar;

import demoqaPage.Browser;

public class Main {
    public static void main(String [] args){
        Browser browser = new Browser();
        browser.loadURL("https://www.despegar.com.mx/");
        Despegar despegar = new Despegar(browser.getDriver());
        despegar.clickOnVuelos();
        despegar.fillOrigenPlace("Chihuahua");
        despegar.clickOptionChihuahua();
        despegar.fillDestinyPlace("Cancun,Quintana Roo,Mexico");
        despegar.selectDateGoOut();
        despegar.selectDateBack();
        despegar.clickSearch();



    }
}

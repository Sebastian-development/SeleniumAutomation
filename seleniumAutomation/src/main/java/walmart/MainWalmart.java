package walmart;

import demoqaPage.Browser;

public class MainWalmart {
    public static void main(String [] args) {
        Browser browser = new Browser();
        browser.loadURL("https://www.walmart.com.mx/inicio");
        Walmart walmart = new Walmart(browser.getDriver());
        walmart.closeTipWindow();
        walmart.searchIphone("Iphone");
        walmart.clickSearch();
        walmart.selectArticle();
        walmart.addToCart();
        walmart.selectCart();
        walmart.selectContinueWithThePurshase();
        walmart.buyAsGuest();
    }
}

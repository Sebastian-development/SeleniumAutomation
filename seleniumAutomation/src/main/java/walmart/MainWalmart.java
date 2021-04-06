package walmart;

import demoqaPage.Browser;

public class MainWalmart {
    public static void main(String [] args) {
        Browser browser = new Browser();
        browser.loadURL("https://www.walmart.com.mx/inicio");
        HomePage homePage = new HomePage(browser.getDriver());
        //Home page
        homePage.closeTipWindow();
        homePage.searchIphone("Iphone");
        homePage.clickSearch();//home page end
        ProductsPage productsPage = new ProductsPage(browser.getDriver());
        //products page
        productsPage.selectArticle();
        BuyPayPage buyPayPage = new BuyPayPage(browser.getDriver());
        //create an object
        BuyAsGuest buyAsGuest = buyPayPage.buyNow();


        buyAsGuest.buyAsGuest();
        buyAsGuest.fillName("Sebastian");
        buyAsGuest.fillLastName("Corral");
        buyAsGuest.fillEmail("sebastian@hotmail.com");


        /*walmart.selectCart();
        walmart.selectContinueWithThePurshase();*/
       // walmart.buyAsGuest();
    }
}

import pom.google.GooglePage;
/*
* int 32000
* float 1.1f
* String 2 "2"
* char 'a'
* double 1.1
* long 123456789807867543423
* */
public class MainStore {
    public static void main (String[] args) throws InterruptedException {
        Browser browser = new Browser();
        //System.out.println(browser);
        browser.loadURL("https://www.amazon.com.mx");
        GooglePage googlePage = new GooglePage(browser.driver);
        googlePage.sendTextToSearchBox("carros");
      //  browser.sendText("//input[@title='Buscar']","carros");
        //Thread.sleep(2000);
        googlePage.clickSearch();
        //browser.clickButton("//span[text()='carros']");
        //browser.clickButton("//input[@value='Buscar con Google']");
        googlePage.clickProduct();
        googlePage.clickAddToCart();
        Thread.sleep(2000);
        browser.printPrize("");




        //int x = 0;
        //String a = "x";
        //float q = 1.1f;

    }
}

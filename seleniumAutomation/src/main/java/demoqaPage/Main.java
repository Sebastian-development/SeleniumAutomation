package demoqaPage;

import org.openqa.selenium.WebElement;

import java.util.List;

public class Main {
    public static void main(String [] args){
    Browser browser = new Browser();
    browser.loadURL("https://www.demoqa.com");
    DemoqaPage demoqaPage = new DemoqaPage(browser.getDriver());
    demoqaPage.clickInElements();
    demoqaPage.clickTextBox();
    demoqaPage.fillUserName("Sebastian");
    demoqaPage.fillEmail("diegox4@hotmail.com");
    demoqaPage.fillCurrentAddress("Ciudad Cuauhtemoc");
    demoqaPage.fillPermanentAddress("Chihuahua, Mexico");
    demoqaPage.clickSubmitButton();
    demoqaPage.getResults("//div[@id='output']/div/p");
    demoqaPage.listElements(demoqaPage.getResults("//div[@id='output']/div/p"));
    demoqaPage.printFiles();
    demoqaPage.clickCheckBox();
    demoqaPage.clickCheckBoxHomme();
    demoqaPage.printTextHomme();
    demoqaPage.ClickOnRadioButton();
    demoqaPage.clickYesRadioButton();
    demoqaPage.printTextYesRadioButton();
    demoqaPage.clickImpressiveRadioButton();
    demoqaPage.printImpressiveRadioButton();
    demoqaPage.listBox();


    /*demoqaPage.clickWebTables();
    demoqaPage.clickButtons();
    demoqaPage.clickLinks();
    demoqaPage.clickBrokenLinksImages();
    demoqaPage.clickUploadAndDownload();
    demoqaPage.clickDynamicProperties();*/
    demoqaPage.getListWebElements("//div[@class='element-list collapse show']/ul/li");
    demoqaPage.listBoxElements(demoqaPage.getListWebElements("//div[@class='element-list collapse show']/ul/li"));
    browser.tearDown();


    }
}

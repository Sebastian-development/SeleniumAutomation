package demoqaPage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DemoqaPage {
   private WebDriver driver;
    @FindBy(how = How.XPATH, using = "//div[@class='card-body']/h5[text()='Elements']")
    private WebElement clickOnElementsButton;
    @FindBy(how = How.ID, using = "item-0")
    private WebElement clickTextBox;
    @FindBy(how = How.XPATH, using = "//div[@class='col-md-9 col-sm-12']/input[@type='text']")
    private WebElement fillUserName;
    @FindBy(how = How.ID, using = "userEmail")
    private WebElement fillEmail;
    @FindBy(how = How.ID, using = "currentAddress")
    private WebElement fillCrurentAddress;
    @FindBy(how = How.ID, using = "permanentAddress")
    private WebElement fillPermanentAddress;
    @FindBy(how = How.XPATH, using = "//form[@id='userForm']/div/div/button")
    private WebElement clickButtonSubmit;
    @FindBy(how = How.XPATH, using = "//*[@id='name']")
    private WebElement printName;
    @FindBy(how = How.ID, using = "item-1")
    private WebElement clickCheckBox;
    @FindBy(how = How.XPATH, using = "//label[@for='tree-node-home']")
    private WebElement clickCheckBoxHomme;
    @FindBy(how = How.ID, using = "result")
    private WebElement printTextCheckBox;
    @FindBy(how = How.ID, using = "item-2")
    private WebElement clickOnRadioButton;
    @FindBy(how = How.XPATH, using = "//label[@for='yesRadio']")
    private WebElement clickOnYesRadioButton;
    @FindBy(how = How.XPATH, using = "//label[@for='impressiveRadio']")
    private WebElement clickOnImpressiveRadioButton;
    @FindBy(how = How.XPATH, using = "//p[@class='mt-3']")
    private WebElement yesRadioButton;
    @FindBy(how = How.XPATH, using = "//p[@class='mt-3']")
    private WebElement impressiveRadioButton;
    @FindBy(how = How.ID, using = "item-3")
    private WebElement clickOnWebTables;
    @FindBy(how = How.ID, using = "item-4")
    private WebElement clickOnButtons;
    @FindBy(how = How.ID, using = "item-5")
    private WebElement clickOnLinks;
    @FindBy(how = How.ID, using = "item-6")
    private WebElement clickOnBrokenLinksImages;
    @FindBy(how = How.ID, using = "item-7")
    private WebElement clickOnUploadAndDownload;
    @FindBy(how = How.ID, using = "item-8")
    private WebElement clickOnDynamicProperties;
    public DemoqaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
    public void clickInElements(){
        scrollDown();
       clickOnElementsButton.click();
    }

    public void clickTextBox(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(clickTextBox));
        clickTextBox.click();
    }
    public void clickWebTables() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnWebTables));
        clickOnWebTables.click();
    }
    public void clickButtons() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnButtons));
        clickOnButtons.click();
    }
    public void clickLinks() {
        scrollDown();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnLinks));
        clickOnLinks.click();

    }
    public void clickBrokenLinksImages() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnBrokenLinksImages));
        clickOnBrokenLinksImages.click();
    }
    public void clickUploadAndDownload() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnUploadAndDownload));
        clickOnUploadAndDownload.click();
    }
    public void clickDynamicProperties() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnDynamicProperties));
        clickOnDynamicProperties.click();
    }

    public void fillUserName(String name){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(fillUserName));
    fillUserName.sendKeys(name);
    }
    public void fillEmail(String email){
        fillEmail.sendKeys(email);
    }
    public void fillCurrentAddress(String currentAddress){
        fillCrurentAddress.sendKeys(currentAddress);
    }
    public void fillPermanentAddress(String permanentAddress ){
        fillPermanentAddress.sendKeys(permanentAddress);
    }

    public void clickSubmitButton(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clickButtonSubmit));
        clickButtonSubmit.click();

    }
    public void printFiles(){
    printName.getText();
        System.out.println(printName.getText());
    }
    public List<WebElement> getResults(String xpath){
        List<WebElement> elements = driver.findElements(By.xpath(xpath));
        return elements;
    }
    public void listBox(){
        List<WebElement> clicks = driver.findElements(By.xpath("//div[@class='element-list collapse show']/ul/li"));
        for(int i=0;i<clicks.size();i++){
            clicks.get(i).click();
            if(i == 4){scrollDown();}
        }

    }
    public void clickCheckBox(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(clickCheckBox));
        clickCheckBox.click();
    }
    public void clickCheckBoxHomme(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(clickCheckBoxHomme));
        clickCheckBoxHomme.click();
    }
    public String   printTextHomme(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnRadioButton));
        System.out.println(printTextCheckBox.getText());
        return printTextCheckBox.getText();
    }
    public void ClickOnRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnRadioButton));
        clickOnRadioButton.click();
    }
    public void clickYesRadioButton(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(clickOnYesRadioButton));
        clickOnYesRadioButton.click();
    }
    public void clickImpressiveRadioButton(){
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.elementToBeClickable(clickButtonSubmit));
        clickOnImpressiveRadioButton.click();
    }
    public String printTextYesRadioButton(){
        System.out.println(yesRadioButton.getText());
        return yesRadioButton.getText();
    }
    public String printImpressiveRadioButton(){
        System.out.println(impressiveRadioButton.getText());
        return impressiveRadioButton.getText();
    }
    public void listElements(List<WebElement> webElements){
        for(int i=0;i<webElements.size();i++){
            WebElement elements = webElements.get(i);
            System.out.println(elements.getText());
        }
    }
    public List<WebElement> getListWebElements(String xpath){
        List<WebElement> boxInElements = driver.findElements(By.xpath(xpath));
        return  boxInElements;
    }
    public String listBoxElements(List<WebElement> boxElements){
        String s = null;
        for(int i=0;i<boxElements.size();i++){
            WebElement elementsBox = boxElements.get(i);
            s = elementsBox.getText();
            System.out.println(s);
        }
        return s;
    }


}



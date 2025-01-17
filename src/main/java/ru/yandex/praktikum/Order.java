package ru.yandex.praktikum;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order extends BasePage{
    private By orderButton =  By.className("Button_Button__ra12g"); //кнопка "Заказать"
    private By orderButtonBig = By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[2]/div[5]/button"); //Большая кнопка "Заказать"
    private By nameField = By.xpath("//input[@placeholder='* Имя']"); //поле "Имя"
    private By surnameField = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']"); //Поле "Фамилия"
    private By adressField = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']"); //Поле "Адрес"
    private By metroStationField = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input"); //Дропдаун "Станция метро"
    private By metroCherkizovskaya = By.xpath("//button[@value=2]");
    private By metroSokolniki = By.xpath("//button[@value=4]");
    private By phoneNumberField = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']"); //Поле "Телефон"
    private By continueButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); //кнопка "Далее"

    private By deliveryDate = By.xpath("//input[@placeholder='* Когда привезти самокат']");//Когда привезти
    private By headingSamokat = By.xpath(".//div[@class='Order_Header__BZXOb']");
    private By rentalPeriod = By.xpath(".//div[@class='Dropdown-control']/div[@class='Dropdown-placeholder']"); //срок аренды
    private By twoDaysRental = By.xpath(".//div[@class='Dropdown-menu']/div[2]"); //аренда на 2 суток
    private By threeDaysRental = By.xpath(".//div[@class='Dropdown-menu']/div[3]"); //аренда на 3 суток
    private By colorBlack = By.className("Checkbox_Label__3wxSf"); //цвет черный жемчуг
    private By colorGrey = By.className("Checkbox_Label__3wxSf"); // цвет серая безысходность
    private By comment = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']"); //комментарий для курьера
    private By orderButtonMiddle = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); // кнопка "заказать" после заполнения всех полей
    private By buttonYes = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() ='Да']"); //кнпока Да
    private By viewOrderButton = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']");
    //Кпнока "Посмотреть"

    private By samokat = By.xpath(".//img[@src='/assets/scooter.svg']");
    private By yandex = By.xpath(".//img[@src='/assets/ya.svg']");
    private By errorMessage = By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");

    public void orderNotFoundShouldBeDisplayed() {
        webDriver.findElement(By.className("Header_Link__1TAG7")).click();
        webDriver.findElement(By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")).sendKeys("123");
        webDriver.findElement(By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();
        boolean isDisplayed = webDriver.findElement(By.cssSelector(".Track_NotFound__6oaoY")).isDisplayed();
        Assert.assertTrue("Order not found image is not displayed", isDisplayed);
    }

    public Order (WebDriver webDriver) {
        super(webDriver);
    }
        public void clickOrderButtonTop(){
            webDriver.findElement(orderButton).click();
        }
        public void clickOrderButtonBig(){
        webDriver.findElement(orderButtonBig).click();
        }
        public void scrollToOrderButtonBig(){
            WebElement element = webDriver.findElement(orderButtonBig);
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
        }
        public void enterName(String text){
            webDriver.findElement(nameField).sendKeys(text);
        }
        public void enterSurname(String text){
            webDriver.findElement(surnameField).sendKeys(text);
        }
        public void enterAdress(String text){
            webDriver.findElement(adressField).sendKeys(text);
        }
        public void clickMetroStation(){
            webDriver.findElement(metroStationField).click();
        }
        public void stationCherkizovskaya(){
            webDriver.findElement(metroCherkizovskaya).click();
        }
        public void stationSokolniki(){
            webDriver.findElement(metroSokolniki).click();
        }
        public void enterNumber(String text){
            webDriver.findElement(phoneNumberField).sendKeys(text);
        }
        public void clickContinueButton(){
            webDriver.findElement(continueButton).click();
        }
        public void deliveryDate(String day){
            webDriver.findElement(deliveryDate).sendKeys(day);
        }
        public void clickRentalPeriod(){
        webDriver.findElement(rentalPeriod).click();
        }

        public void clickTwoDayRental() {
            webDriver.findElement(twoDaysRental).click();
        }
        public void clickThreeDayRental() {
        webDriver.findElement(threeDaysRental).click();
        }
        public void clickColorBlack() {
            webDriver.findElement(colorBlack).click();
        }
        public void clickColorGray () {
            webDriver.findElement(colorGrey).click();
        }
        public void enterComment(String text) {
            webDriver.findElement(comment).sendKeys(text);
        }
        public void clickOrderButtonMiddle () {
            webDriver.findElement(orderButtonMiddle).click();
        }
        public void clickYesButton () {
            webDriver.findElement(buttonYes).click();
        }

        public boolean displayButtonView() {
            return webDriver.findElement(viewOrderButton).isDisplayed();
        }
        public void clickButtonViewOrder () {
            webDriver.findElement(viewOrderButton).click();
        }
    public void clickEmptySpace() {webDriver.findElement(headingSamokat).click();}

        public void clickSamokat () {webDriver.findElement(samokat).click();}
        public boolean displaySamokat () {return webDriver.findElement(samokat).isDisplayed();};

        public void clickYandex () {webDriver.findElement(yandex).click();}
        public boolean displayYandex () {return webDriver.findElement(yandex).isDisplayed();};
        public boolean errorNameText() {return webDriver.findElement(errorMessage).isDisplayed();}




    }



package ru.yandex.practikum;


import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.praktikum.MainPage;
import ru.yandex.praktikum.UiTest;
import ru.yandex.praktikum.OrderStatusPage;


public class OrderMainTest extends UiTest {

    @Test
    public void orderNotFoundShouldBeDisplayed() {
        webDriver.findElement(By.className("Header_Link__1TAG7")).click();
        webDriver.findElement(By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")).sendKeys("123");
        webDriver.findElement(By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']")).click();
        boolean isDisplayed = webDriver.findElement(By.cssSelector(".Track_NotFound__6oaoY")).isDisplayed();
        Assert.assertTrue("Order not found image is not displayed", isDisplayed);
    }
    @Test
    public void orderNotFoundShouldBeDisplayedPOM() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderStatusButton();
        mainPage.enterOrderNumber("123");
        mainPage.clickGoButton();
        OrderStatusPage orderStatusPage = new OrderStatusPage(webDriver);
        boolean isDisplayed = orderStatusPage.orderNotFoundIsDisplayed();
        Assert.assertTrue("Order not found image is not displayed", isDisplayed);

    }

    @Test
    public void scrollFaq (){
        MainPage mainPage= new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionOne();
    }
    @Test
    public void clickToFaqTwo () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionTwo();
    }
    @Test
    public void clickToFaqThree () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionThree();
    }
    @Test
    public void clickToFaqFour () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionFour();
    }
    @Test
    public void clickToFaqFive () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionFive();
    }
    @Test
    public void clickToFaqSix () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionSix();
    }
    @Test
    public void clickToFaqSeven () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionSeven();
    }
    @Test
    public void clickToFaqEight () {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        mainPage.clickQuestionEight();
    }

}
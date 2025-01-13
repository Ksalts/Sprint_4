package ru.yandex.practikum;


import org.junit.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import ru.yandex.praktikum.MainPage;
import ru.yandex.praktikum.Order;
import ru.yandex.praktikum.UiTest;
import ru.yandex.praktikum.OrderStatusPage;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderMainTest extends UiTest {
    private int questionNumber;

    public OrderMainTest(int questionNumber) {
        this.questionNumber = questionNumber;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getFaqData() {
        return Arrays.asList(new Object[][]{
                {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}
        });
    }

    @Test
    public void clicktoFaq() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.scrollToFaq();
        switch (questionNumber) {
            case 1:
                mainPage.clickQuestionOne();
                break;
            case 2:
                mainPage.clickQuestionTwo();
                break;
            case 3:
                mainPage.clickQuestionThree();
                break;
            case 4:
                mainPage.clickQuestionFour();
                break;
            case 5:
                mainPage.clickQuestionFive();
                break;
            case 6:
                mainPage.clickQuestionSix();
                break;
            case 7:
                mainPage.clickQuestionSeven();
                break;
            case 8:
                mainPage.clickQuestionEight();
                break;
            default:
                throw new IllegalArgumentException("Invalid question number: " + questionNumber);
        }
    }
}





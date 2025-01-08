package ru.yandex.praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class UiTest {
    protected WebDriver webDriver;


    @Before
    public void setup() {
        WebDriverManager.edgedriver().setup();
        webDriver = new EdgeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }


    @After
    public void tearDown() {
        webDriver.quit();
    }

}

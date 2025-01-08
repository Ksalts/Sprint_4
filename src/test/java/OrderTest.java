import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.Order;
import ru.yandex.praktikum.UiTest;

public class OrderTest extends UiTest {
    @Test

    public void firstOrder (){
        Order order = new Order(webDriver);
        order.clickOrderButtonTop();
        order.enterName("Александр");
        order.enterSurname("Пушкин");
        order.enterAdress("Пушкина, 30");

        order.clickMetroStation();
        order.stationSokolniki();
        order.enterNumber("87771232349");
        order.clickContinueButton();

        order.DeliveryDate("11.01.2024");
        order.clickEmptySpace();
        order.clickRentalPeriod();
        order.clickThreeDayRental();
        order.clickColorGray();
        order.enterComment("тык тык тык");
        order.clickOrderButtonMiddle();
        order.clickYesButton();
        boolean isDisplayed = order.displayButtonViev();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
        order.clickButtonViewOrder();


    }

    @Test
    public void secondOrder(){
        Order order = new Order(webDriver);
        order.clickOrderButtonTop();
        order.enterName("Стивен");
        order.enterSurname("Кинг");
        order.enterAdress("Зеленая, 30");

        order.clickMetroStation();
        order.stationSokolniki();
        order.enterNumber("87771232329");
        order.clickContinueButton();

        order.DeliveryDate("12.01.2024");
        order.clickEmptySpace();
        order.clickRentalPeriod();
        order.clickTwoDayRental();
        order.clickColorGray();
        order.enterComment("хорошее привозите, а плохое не привозите");
        order.clickOrderButtonMiddle();
        order.clickYesButton();
        boolean isDisplayed = order.displayButtonViev();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
        order.clickButtonViewOrder();


    }
    @Test
    public void CheckSamokat () {
        Order order = new Order(webDriver);


        order.clickSamokat();
        boolean isDisplayedTwo = order.displaySamokat();
        Assert.assertTrue("Не попал на главную страницу", isDisplayedTwo);


        order.clickYandex();
        boolean isDisplayedThree = order.displayYandex();
        Assert.assertTrue("Не попал на главную страницу Yandex", isDisplayedThree);
    }
    @Test
    public void CheckOrder () {
        Order order = new Order(webDriver);
        order.clickOrderButtonTop();

        order.enterName("ertwert");
        order.clickEmptySpace();
        boolean isName = order.ErrorNameText();
        Assert.assertTrue("Некорректное имя", isName );



    }
}

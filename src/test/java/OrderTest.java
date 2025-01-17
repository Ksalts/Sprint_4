import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.Order;
import ru.yandex.praktikum.UiTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class OrderTest extends UiTest {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String day;
    private final String comment;

    // Конструктор для параметров
    public OrderTest(String name, String surname, String address, String phone, String day, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.day = day;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getOrderData() {
        return Arrays.asList(new Object[][]{
                {"Стивен", "Кинг", "Зеленая, 30", "87771232329", "12.01.2024", "хорошее привозите, а плохое не привозите"},
                {"Иван", "Иванов", "Ленина, 10", "89991112233", "15.01.2024", "тестовый заказ"}
        });
    }

    @Test
    public void firstOrder() {
        Order order = new Order(webDriver);
        order.clickOrderButtonTop();
        order.enterName(name);
        order.enterSurname(surname);
        order.enterAdress(address);

        order.clickMetroStation();
        order.stationSokolniki();
        order.enterNumber(phone);
        order.clickContinueButton();

        order.deliveryDate(day);
        order.clickEmptySpace();
        order.clickRentalPeriod();
        order.clickThreeDayRental();
        order.clickColorGray();
        order.enterComment(comment);
        order.clickOrderButtonMiddle();
        order.clickYesButton();

        boolean isDisplayed = order.displayButtonView();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
        order.clickButtonViewOrder();
    }


    @Test
    public void secondOrder(){
        Order order = new Order(webDriver);
        order.scrollToOrderButtonBig();
        order.clickOrderButtonBig();
        order.enterName(name);
        order.enterSurname(surname);
        order.enterAdress(address);

        order.clickMetroStation();
        order.stationSokolniki();
        order.enterNumber(phone);
        order.clickContinueButton();

        order.deliveryDate(day);
        order.clickEmptySpace();
        order.clickRentalPeriod();
        order.clickTwoDayRental();
        order.clickColorGray();
        order.enterComment(comment);
        order.clickOrderButtonMiddle();
        order.clickYesButton();
        boolean isDisplayed = order.displayButtonView();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
        order.clickButtonViewOrder();


    }
    @Test
    public void checkSamokat () {
        Order order = new Order(webDriver);


        order.clickSamokat();
        boolean isDisplayedTwo = order.displaySamokat();
        Assert.assertTrue("Не попал на главную страницу", isDisplayedTwo);


        order.clickYandex();
        boolean isDisplayedThree = order.displayYandex();
        Assert.assertTrue("Не попал на главную страницу Yandex", isDisplayedThree);
    }
    @Test
    public void checkOrder () {
        Order order = new Order(webDriver);
        order.clickOrderButtonTop();

        order.enterName("ertwert");
        order.clickEmptySpace();
        boolean isName = order.errorNameText();
        Assert.assertTrue("Некорректное имя", isName );



    }
}

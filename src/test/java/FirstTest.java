import base.BaseUITest;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static enums.Page.MAIN_PAGE;

class FirstTest extends BaseUITest {

    private final String enter = "Вход";

    @Test
    void firstTestBrowser() {
        open(MAIN_PAGE.getUri());
        $(byText(enter)).shouldBe(visible);
    }

    @Test
    void secondTestBrowser() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .checkEnter();
    }

    @Test
    void thirdTestBrowser() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getMenuBlock()
                .clickPayments();

    }
}

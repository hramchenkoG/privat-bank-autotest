package base;

import enums.Page;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class BaseUITest {

    @BeforeEach
    public void init() {
        clearBrowserCookies();
    }

    @AfterEach
    public void tearDown() {
        clearBrowserCookies();
    }

    public void openPage(Page page) {
        open(page.getUri());
    }
}

import base.BaseUITest;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.page;
import static enums.Page.*;

public class SecondTest extends BaseUITest {

    @Test
    public void main() {
      openPage(MAIN_PAGE);
      page(MainPage.class)
              .getHeaderBlock()
              .checkLoginButton()
              .clickLogin();
    }

    @Test
    public void headerBlockHomePageButtonTest() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getHeaderBlock()
                .checkHomePageButton()
                .clickHomePageButton();

    }

    @Test
    public void headerBlockSearchButtonTest() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getHeaderBlock()
                .clickSearchButton()
                .searchButtonSetValue();
        //page(PaymenPage.class);
    }

    @Test
    public void headerBlockWalletButtonTest() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getHeaderBlock()
                .clickWalletButton();
    }

    @Test
    public void headerBlockServiceButtonTest() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getHeaderBlock()
                .checkAndClickServiceButton();
    }

    @Test
    public void headerBlockArchiveButtonTest() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getHeaderBlock()
                .checkAndClickArchiveButton();
    }

    @Test
    public void headerBlockExchangesButtonTest() {
        openPage(MAIN_PAGE);
        page(MainPage.class)
                .getHeaderBlock()
                .checkAndClickExchangeButton();
    }

}

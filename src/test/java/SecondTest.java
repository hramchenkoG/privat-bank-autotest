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

}

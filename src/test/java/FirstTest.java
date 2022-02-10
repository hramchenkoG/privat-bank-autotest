import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.Click;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static groovyjarjarantlr.build.ANTLR.root;
import static java.time.Duration.ofSeconds;

class FirstTest {

   private final String url = "https://next.privat24.ua/?lang=ru";
   private final String enter = "Вход";
   @BeforeEach
   public void init() {
       clearBrowserCookies();
   }
    @AfterEach
    public void tearDown() {
        clearBrowserCookies();
    }


    @Test
    void firstTestBrowser() {
        open(url);
        $(byText(enter)).shouldBe(visible);
    }
    @Test
    void secondTestBrowser() {
        open(url);
        $(byText(enter)).click();
          $(withText("QR-код для входа через смартфон")).shouldBe(visible, ofSeconds(30));
          $("h1").shouldHave(cssValue("color", "green"));
       // $("[class*=\"commandAppearActive\"]").$(byText("[class^=\"root\"]")).shouldBe(visible,ofSeconds(30));



    }
}

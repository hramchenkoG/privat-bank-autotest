package homework;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

class AutomatisationPractice {

    @Test

    void pagesHaveSoftAssertions () {
        // open github.com
        open("https://github.com/");
        // find search bar
        //type "selenide" in search bar
        // $("data-test-selector=\"nav-search-input\"").setValue("selenide").pressEnter(); - не работает,почему?
        $("[placeholder='Search GitHub']").setValue("selenide").pressEnter(); // - "[placeholder='Search GitHub']" - не работает без ' ' ,почему?
        //find selenide/selenide and click on it
        $$(".repo-list").first().$("a").click();
        // find Wiki and click on it
        $("[data-ga-click='Repository, Navigation click, Wikis tab']").click(); // - та же история,что и с 17 строкой
        sleep(3000);
        // check if there is SoftAssertions in Chapters
        $(byText("Soft assertions")).shouldBe(visible);
        // click on Soft ASSertions
        $("#wiki-body > div > ul:nth-child(3) > li:nth-child(6) > a").click(); // можно ли сократить?
        $x("//html/body/div[4]/div/main/div[2]/div/div/div[3]/div/div[2]/div/div/ol[3]/li/text()").$(byText("Using JUnit4 just describe rule inside test"));
                sleep(4000);








     }



}

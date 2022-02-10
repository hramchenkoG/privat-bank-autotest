package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestSelenideContributor {
    @Test
    void andeiSolntsevShouldBeTheBestContributor() {
        // open selenide page
        open("https://github.com/selenide/selenide");

        // put mouse to first element in contributors field
        $(".BorderGrid").$(byText("Contributors"))
                .closest("div").$("ul li").hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev")); // так проходит быстрее(до этого по какойто причине падал)
       // $$(".Popover-message").filterBy(visible).first().shouldHave(text("Andrei Solntsev")); // тоже самое,только фильтрует все попапы,соответсвенно проходит дольше
        
    }
}

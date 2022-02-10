package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {
    @Test
    void shouldFindSelenideRepositoryPageTest(){
        // открыть страницу github.com
        open("https://github.com");
        // ввести в поле поиска selenide
        // нажать enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
        // нажимаем на линк от первого результата поиска
        $$(".repo-list li").first().$("a").click();
        // check в заголовке встречается selenide/selenide
        $("h1").should(Condition.text("selenide / selenide"));
        // arrange
        // act
        // assert



    }
}

package pages;


import blocks.HeaderBlock;
import blocks.MenuBlock;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public MainPage checkEnter() {
        $(byText("Вход")).shouldBe(visible);
        return this;
    }

    public HeaderBlock getHeaderBlock() {
        return new HeaderBlock("header");
    }

    public MenuBlock getMenuBlock() {
        return new MenuBlock("[class^=\"menu\"]");
    }

}

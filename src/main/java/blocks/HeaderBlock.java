package blocks;

import base.BaseBlock;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class HeaderBlock extends BaseBlock {

    public HeaderBlock(String rootSelector) {
        super(rootSelector);
    }

    public HeaderBlock clickLogin() {
        getRootElement().$("[data-qa-node=\"login\"]")
                .click();
        return this;
    }

    public HeaderBlock checkLoginButton() {
        getRootElement().$(byText("Sign in"))
                .shouldBe(visible);
        return this;
    }

    public HeaderBlock clickHomePageButton() {
        getRootElement().$("[title=\"Home page\"]")
                .click();
        return this;
    }

    public HeaderBlock checkHomePageButton() {
        getRootElement().$("[title=\"Home page\"]")
                .shouldBe(visible);
        return this;
    }

    public HeaderBlock clickSearchButton() {
        getRootElement().$(".sideA_cakTArHgwR > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")
                .click();
        return this;
    }

    public HeaderBlock searchButtonSetValue() {
        sleep(200);
        $("[data-qa-node=\"query\"]")
                .setValue("Bank");
        $(byText("By Bank Details"))
                .shouldBe(visible)
                .click();
        return this;
    }

    public HeaderBlock clickWalletButton() {
        getRootElement()
                .$("[title=\"Wallet\"]")
                .shouldBe(visible)
                .click();
        return this;
    }

    public HeaderBlock checkAndClickServiceButton() {
        getRootElement()
                .$("[title=\"Services\"]")
                .shouldBe(visible)
                .click();
        return this;
    }

    public HeaderBlock checkAndClickArchiveButton() {
        getRootElement()
                .$("[title=\"Archive\"]")
                .shouldBe(visible)
                .click();
        return this;
    }

    public HeaderBlock checkAndClickExchangeButton() {
        getRootElement()
                .$("[class^=\"exchangeRates\"]")
                .shouldBe(visible)
                .click();

        return this;
    }

}


//$([class^="divider"]).click().enterValue("")
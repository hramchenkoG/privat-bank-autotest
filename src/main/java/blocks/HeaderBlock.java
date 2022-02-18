package blocks;

import base.BaseBlock;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;


public class HeaderBlock extends BaseBlock {

    public HeaderBlock(String rootSelector) {
        super(rootSelector);
    }

    public HeaderBlock clickLogin() {
       getRootElement().$("[data-qa-node=\"login\"]").click();
        return this;
    }

    public HeaderBlock checkLoginButton() {
        getRootElement().$(byText("Sign in")).shouldBe(visible);
        return this;
    }
}

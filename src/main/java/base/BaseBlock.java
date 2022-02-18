package base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class BaseBlock {

    private final String rootSelector;

    public BaseBlock(String rootSelector) {
        this.rootSelector = rootSelector;
    }

    protected SelenideElement getRootElement() {
        return $(rootSelector);
    }
}

package blocks;

import base.BaseBlock;

import static com.codeborne.selenide.Selectors.byText;

public class MenuBlock extends BaseBlock {


    public MenuBlock(String rootSelector) {
        super(rootSelector);
    }

    public MenuBlock clickPayments(){
        getRootElement().$(byText("Payments")).click();
        return this;
    }

}

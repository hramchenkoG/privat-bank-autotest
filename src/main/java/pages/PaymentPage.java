package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class PaymentPage {

    public PaymentPage checkEnter() {
        $(byText("Payments"))
                .shouldBe(visible);
        return this;
    }

    public PaymentPage checkNewPaymentVisibility() {
        $(byText("New payment"))
                .shouldBe(visible);
        return this;
    }

    public PaymentPage checkIfItPossibleToEnterDataInSearchBarAndClickOnIt() {
        $("[placeholder^=\"Enter USREOU\"]")
                .setValue("Bank");
        $(byText("Банкова 3, ОСББ"))
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage checkPopularTemplatesVisibility() {
        $(byText("Your templates will be here"))
                .shouldBe(visible);
        return this;
    }

    public PaymentPage checkCategoriesVisibility() {
        $(byText("Categories"))
                .shouldBe(visible);
        return this;
    }

    public PaymentPage utilityPaymentsVisibilityAndClick() {
        $(byText("Комунальні платежі"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage internetAndTvVisibilityAndClick() {
        $(byText("Інтернет та ТБ"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage taxesAndFeesVisibilityAndClick() {
        $(byText("Податки та збори"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage educationAndKindergartenVisibilityAndClick() {
        $(byText("Освіта і дитячі сади"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage insuranceCompaniesVisibilityAndClick() {
        $(byText("Страхові компанії"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage cosmeticsVisibilityAndClick() {
        $(byText("Косметика"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage repaymentVisibilityAndClick() {
        $(byText("Погашення кредитів"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage finesAndViolationsVisibilityAndClick() {
        $(byText("Штрафи і порушення"))
                .shouldBe(visible)
                .click();
        sleep(3000);
        return this;
    }

    public PaymentPage travelCompaniesVisibilityAndClick() {
        $(byText("Туристичні компанії"))
                .shouldBe(visible).click();
        sleep(3000);
        return this;
    }

    public PaymentPage informationAboutTheServiceAndClickOnReadMore() {
        $(byText("Information about the service")).shouldBe(visible);
        $(byText("Read more"))
                .shouldBe(visible)
                .click();
        $(byText("Online payment options via site"))
                .shouldBe(visible);
        sleep(3000);
        return this;
    }

    public PaymentPage utilityPaymentsCheck() {
        $(byText("Комунальні платежі"))
                .click();
        $(byText("Київводоканал, ПрАТ АК"))
                .shouldBe(visible)
                .click();
        $("[title=\"за адресою\"]")
                .shouldBe(visible)
                .click();
        $("[data-qa-node=\"street\"]")
                .setValue("бикова");
        $(byText("КИЇВ, БИКОВА ЛЕОНІДА Б-Р"))
                .shouldBe(visible)
                .click();
        $("[data-qa-node=\"house\"]")
                .setValue("12");
        $(byText("Д12"))
                .shouldBe(visible)
                .click();
        $("[data-qa-node=\"id_obj\"]")
                .setValue("69");
        $(byText("КВ69"))
                .shouldBe(visible)
                .click();
        $("[type=\"submit\"]")
                .shouldBe()
                .click();
        sleep(5000);
        return this;
    }
}
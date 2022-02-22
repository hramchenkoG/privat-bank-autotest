import base.BaseUITest;
import org.junit.jupiter.api.Test;
import pages.PaymentPage;

import static com.codeborne.selenide.Selenide.page;
import static enums.Page.PAYMENTS_MAIN_PAGE;

public class PaymenPageTests extends BaseUITest {


    @Test
    public void newPaymentVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .checkNewPaymentVisibility();

    }

    @Test
    public void paymentPageSearchBarTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .checkIfItPossibleToEnterDataInSearchBarAndClickOnIt();

    }

    @Test
    public void paymentPagePopularTemplatesBarVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .checkPopularTemplatesVisibility();
    }

    @Test
    public void categoriesVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .checkCategoriesVisibility();
    }

    @Test
    public void utilityPaymentsVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .utilityPaymentsVisibilityAndClick();
    }

    @Test
    public void internetAndTvVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .internetAndTvVisibilityAndClick();
    }

    @Test
    public void taxesAndFeesVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .taxesAndFeesVisibilityAndClick();
    }

    @Test
    public void educationAndKindergartenVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .educationAndKindergartenVisibilityAndClick();
    }

    @Test
    public void insuranceCompaniesVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
              .insuranceCompaniesVisibilityAndClick();
    }

    @Test
    public void cosmeticsVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .cosmeticsVisibilityAndClick();
    }

    @Test
    public void repaymentVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .repaymentVisibilityAndClick();
    }

    @Test
    public void finesAndViolationsVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .finesAndViolationsVisibilityAndClick();
    }

    @Test
    public void travelCompaniesVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .travelCompaniesVisibilityAndClick();
    }

    @Test
    public void informationAboutTheServiceAndReadMoreTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .informationAboutTheServiceAndClickOnReadMore();
    }

    @Test
    public void utilityPaymentsTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .utilityPaymentsCheck();
    }
}

import base.BaseUITest;
import org.junit.jupiter.api.Test;
import pages.PaymentPage;

import static com.codeborne.selenide.Selenide.page;
import static enums.Page.PAYMENTS_MAIN_PAGE;

public class PaymentPageTests extends BaseUITest {


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
                .searchBarCheck();

    }

    @Test
    public void templatesBarVisibilityTest() {
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
    public void educationVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .educationVisibilityAndClick();
    }

    @Test
    public void insuranceVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
              .insuranceVisibilityAndClick();
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
    public void finesVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .finesVisibilityAndClick();
    }

    @Test
    public void travelVisibilityTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .travelVisibilityAndClick();
    }

    @Test
    public void informationAboutTheServiceAndReadMoreTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .informationVisibilityAndClickOnReadMore();
    }

    @Test
    public void utilityPaymentsTest() {
        openPage(PAYMENTS_MAIN_PAGE);
        page(PaymentPage.class)
                .utilityPaymentsCheck();
    }
}

package CoreServices;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.coreServices.createProviderAdmin_webElement;
import pages.coreServices.userProfile_webElement;
import utility.brokenlink;

public class createProviderAdmin extends TestBase {

    createProviderAdmin_webElement CrPrd;
    brokenlink bl;

    @BeforeTest()
    public void init() throws InterruptedException {
        CrPrd = new createProviderAdmin_webElement(driver);
        bl = new brokenlink(driver);
    }

    @Description("Validate user can login to the Egypt Admin dashboard")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void loginEgyptAdmin() throws Exception {
        try {
            CrPrd.loginEgyptAdmin();

            //trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }

    }

    @Description("Validate user can create Provider admin on the Egypt Admin dashboard")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void createProviderAdmin() throws Exception {
        try {
            CrPrd.navigate2Provider();

            //trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }

    }
}

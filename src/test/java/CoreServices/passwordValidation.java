package CoreServices;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.coreServices.passwordValidation_webElement;
import utility.brokenlink;

public class passwordValidation extends TestBase {

    passwordValidation_webElement Usr;
    brokenlink bl;

    @BeforeTest()
    public void init() throws InterruptedException {
        Usr = new passwordValidation_webElement(driver);
        bl = new brokenlink(driver);
    }

    @Description("Validate Error when omitting confirm password fields in the user profile page")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void passwordValidationPrint() throws Exception {
        try {
            Usr.updateConfirmPassword();

            //trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }

    }

    @Description("Validate Error when omitting Old Password fields in the user profile page")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void passwordValidationError() throws Exception {
        try {
            Usr.updateOldPassword();

            //trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }
    }


    @Description("Validate Error when omitting old password, prompt error message “Incorrect Old Password” is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void passwordError() throws Exception {
        try {
            Usr.incorrectOldPassword();

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

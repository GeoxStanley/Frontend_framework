package CoreServices;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.coreServices.landingPage_webElements;
import utility.brokenlink;

public class landingPage extends TestBase {


    landingPage_webElements lp;
    brokenlink bl;

    @BeforeTest()
    public void init() throws InterruptedException {
        lp = new landingPage_webElements(driver);
        bl = new brokenlink(driver);
    }


    @Description("Validate Facebook social icon works properly")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void validFacebook() throws Exception {
        try {
            lp.validFacebook();

            //trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }
    }

    @Description("Validate Mail  icon works properly")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void validMail() throws Exception {
        try {

            lp.validMail();

            //stg.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //stg.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }
    }

    @Description("Validate Instagram social icon works properly")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void validInstagram() throws Exception {
        try {

            lp.validInstagram();

            //stg.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //stg.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }
    }


    @Description("Validate Twitter social icon works properly")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void validTwitter() throws Exception {
        try {

            lp.validTwitter();

            //stg.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //stg.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }
    }
}

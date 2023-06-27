package CoreServices;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.coreServices.userProfile_webElement;
import utility.brokenlink;

public class userProfile extends TestBase {

    userProfile_webElement UsrP;
    brokenlink bl;

    @BeforeTest()
    public void init() throws InterruptedException {
        UsrP = new userProfile_webElement(driver);
        bl = new brokenlink(driver);
    }

    @Description("Validate user profile when editing the user profile page")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void updateProfile() throws Exception {
        try {
            UsrP.updateUserProfile();

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

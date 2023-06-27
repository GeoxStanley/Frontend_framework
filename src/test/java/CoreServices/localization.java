package CoreServices;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.coreServices.languageLocalization_webElement;
import utility.brokenlink;

public class localization extends TestBase {

    languageLocalization_webElement loc;
    brokenlink bl;

    @BeforeTest()
    public void init() throws InterruptedException {
        loc = new languageLocalization_webElement(driver);
        bl = new brokenlink(driver);
    }

    @Description("Validate localization to login into the provider dashboard using valid credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void arabicLocalization() throws Exception {
        try {
            loc.languageLogin();

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

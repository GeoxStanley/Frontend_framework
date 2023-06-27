package Portals;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.portals_elements.drugTariffWebElement;
import utility.brokenlink;


import static Listeners.ExtentReport.logInfo;

public class drugTariff extends TestBase {

    drugTariffWebElement tariff;
    brokenlink bl;

    @BeforeTest()
    public void init() throws InterruptedException {
        tariff = new drugTariffWebElement(driver);
        bl = new brokenlink(driver);
    }

    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void createProviderWithGeneralTariff() throws Exception {
        try {
            tariff.loginEgypt();
            tariff.createProvider("QA AUTOMATION PROVIDER", "General Tariff");
            tariff.uploadValidDrugTariffFile("QA AUTOMATION PROVIDER");
            //        tariff.uploadDrugTariffFile("drugTariffFile.xlsx");

  //          tariff.deleteProvider("QA AUTOMATION PROVIDER");
  //          trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
 //           trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }

    }
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void deleteProvider() throws Exception {
        try {
//            tariff.uploadValidDrugTariffFile("QA AUTOMATION PROVIDER");
              tariff.deleteProvider("QA AUTOMATION PROVIDER");
            //          trh.updateResultToTestRail(1, "2408", "95", "Test Passed");
        } catch (
                Error |
                Exception e) {
            System.out.println("Assert failed");
            //           trh.updateResultToTestRail(5, "2408", "95", String.valueOf(e));
            Assert.fail();
        }

    }



}

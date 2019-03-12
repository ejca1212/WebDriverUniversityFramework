package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.AdvanceReport;
import utils.DriverFactory;


public class MasterHooks extends DriverFactory  {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @Before
    public void setUp() {
        driver = setUpDriver();
    }

    @After
    public void quitBrowser (Scenario scenario) {
        try {
            if (driver != null) {
                if (scenario.isFailed()) {
                    scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                    AdvanceReport.captureScreenshot();
                }
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            System.out.println("Browser couldn't be closed. " + e.getMessage());
        }
    }

}

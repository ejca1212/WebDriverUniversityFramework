package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public WebDriver setUpDriver(){

        try{
            //Read Config
            ReadConfigFile file = new ReadConfigFile();

            if (driver == null && file.readConfigFile()) {
                DesiredCapabilities capabilities;
                String os;

                switch (file.getBrowser()) {
                    case "firefox":
                        //Identify in which OS is running the test and depending on that, use the correct driver
                        os = System.getProperty("os.name").toLowerCase().contains("windows") ? Constant.WINDOWS_FIREFOXDRIVER_DIRECTORY : Constant.MAC_FIREFOX_DIRECTORY;

                        // Specify which driver will be used
                        System.setProperty("webdriver.gecko.driver", os);

                        capabilities = DesiredCapabilities.firefox();
                        capabilities.setCapability("marionette", true);

                        // Create a new driver object
                        driver = new FirefoxDriver(capabilities);
                        break;

                    case "chrome":

                        //Identify in which OS is running the test and depending on that, use the correct driver
                        os = System.getProperty("os.name").toLowerCase().contains("windows") ? Constant.WINDOWS_CHROMEDRIVER_DIRECTORY : Constant.MAC_CHROMEDRIVER_DIRECTORY;

                        // Specify which driver will be used
                        System.setProperty("webdriver.chrome.driver", os);

                        // Create a new driver object
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        break;

                    case "ie":

                        // Specify which driver will be used
                        System.setProperty("webdriver.ie.driver", Constant.WINDOWS_IEDRIVER_DIRECTORY);


                        capabilities = DesiredCapabilities.internetExplorer();
                        capabilities.setCapability("ignoreZoomSettings", true);

                        // Create a new driver object
                        driver = new InternetExplorerDriver(capabilities);
                        driver.manage().window().maximize();
                        break;
                }
            }
        } catch(Exception e){
            System.out.println("Unable to load browser " + e.getMessage());
        } finally{
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        }
        return driver;
    }

}

package stepdefination;

import cucumber.api.java.Before;
import file.PropertyReader;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by vibhu on 11/12/2016.
 */
public class Hook {
    static WebDriver driver = null;
    static String locatorFirstFile = System.getProperty("user.dir") + "\\src\\main\\resources\\locatorsfile\\locators.properties";
    String chromeDriverFileLocation = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver\\chromedriver.exe";
    String internetExplorerDriverFileLocation = System.getProperty("user.dir") + "\\src\\main\\resources\\iedriver\\IEDriverServer.exe";


    public void driverInitialization() {
//        System.setProperty("webdriver.chrome.driver", chromeDriverFileLocation);
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        String browser = new PropertyReader().readProperty("browser");
        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")){
                   System.setProperty("webdriver.chrome.driver", chromeDriverFileLocation);
        driver = new ChromeDriver();
        }
    }

    public void closeBrowser(){
        driver.quit();
    }

    public static void captureScreenShot(WebDriver ldriver) {
        // Take screenshot and store as a file format
        String screenShotLocation = System.getProperty("user.dir") + "\\target\\screens\\";
        File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile method

            FileUtils.copyFile(src, new File(screenShotLocation + System.currentTimeMillis() + ".png"));
        } catch (IOException e)

        {
            System.out.println(e.getMessage());
        }
    }

}
package stepdefination;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import file.PropertyFileReader;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by vibhu on 11/13/2016.
 */
public class SeleniumMethods extends Hook {

    String locatorFirstFile = System.getProperty("user.dir") + "\\src\\main\\resources\\locatorsfile\\locators.properties";
    Properties prop, propValue;


    public String clickButton(String locator) {
        WebElement element = null;
        prop = PropertyFileReader.locatorFileReader(locatorFirstFile);
        String[] loc = prop.getProperty(locator).split("=@");
        String locatorType = loc[0];
        String locatorValue = loc[1];
        try {


            switch (locatorType) {

                case "id":
                    element = driver.findElement(By.id(locatorValue));
                    break;
                case "name":
                    element = driver.findElement(By.name(locatorValue));
                    break;
                case "xpath":
                    element = driver.findElement(By.xpath(locatorValue));
                    break;
                default:
                    element = driver.findElement(By.cssSelector(locatorValue));

            }
            element.click();
        } catch (Exception e) {
            e.getMessage();
            SeleniumMethods.captureScreenShot(driver);
            throw e;
        }
        return "Pass";
    }


    public String enterText(String locator, String value) {

        WebElement element = null;
        prop = PropertyFileReader.locatorFileReader(locatorFirstFile);
        String[] loc = prop.getProperty(locator).split("=@");
        String locatorType = loc[0];
        String locatorValue = loc[1];

        try {


            switch (locatorType) {

                case "id":
                    element = driver.findElement(By.id(locatorValue));
                    break;
                case "name":
                    element = driver.findElement(By.name(locatorValue));
                    break;
                case "xpath":
                    element = driver.findElement(By.xpath(locatorValue));
                    break;
                case "css":
                    element = driver.findElement(By.cssSelector(locatorValue));

            }

            //  element.sendKeys(propValue.getProperty(value));
            element.sendKeys(value);
        } catch (Exception e) {
            e.getMessage();
            SeleniumMethods.captureScreenShot(driver);
            throw e;
        }

        return "Pass";
    }


    public void alertHandle() {
        Alert confirmationAlert = driver.switchTo().alert();
        confirmationAlert.accept();
    }

    public void verifyTextOnPage(String locator, String expectedText) throws InterruptedException {

        WebElement element = null;
        String actualtext;
        prop = PropertyFileReader.locatorFileReader(locatorFirstFile);
        String[] loc = prop.getProperty(locator).split("=@");
        String locatorType = loc[0];
        String locatorValue = loc[1];
        try {


            switch (locatorType) {

                case "id":
                    Thread.sleep(10000);
                    element = driver.findElement(By.id(locatorValue));
                    break;
                case "name":
                    Thread.sleep(10000);
                    element = driver.findElement(By.name(locatorValue));
                    break;
                case "xpath":
                    Thread.sleep(10000);
                    element = driver.findElement(By.xpath(locatorValue));
                    break;
                default:
                    element = driver.findElement(By.cssSelector(locatorValue));

            }


            actualtext = element.getText();

            Assert.assertEquals(expectedText, actualtext);
        } catch (Exception e) {
            SeleniumMethods.captureScreenShot(driver);
            e.getMessage();
            throw e;


        }


    }

    public String dateOrTimeSelect(String locator, String value) {
        WebElement element = null;
        prop = PropertyFileReader.locatorFileReader(locatorFirstFile);
        String[] loc = prop.getProperty(locator).split("=@");
        String locatorType = loc[0];
        String locatorValue = loc[1];
        try {


            switch (locatorType) {

                case "id":
                    element = driver.findElement(By.id(locatorValue));
                    break;
                case "name":
                    element = driver.findElement(By.name(locatorValue));
                    break;
                case "xpath":
                    element = driver.findElement(By.xpath(locatorValue));
                    break;
                default:
                    element = driver.findElement(By.cssSelector(locatorValue));

            }
            element.click();
         //   element.sendKeys(value);
        } catch (Exception e) {
            e.getMessage();
            SeleniumMethods.captureScreenShot(driver);
            throw e;
        }
        return "Pass";
    }


}

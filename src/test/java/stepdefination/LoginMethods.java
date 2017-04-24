package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by vibhu on 11/13/2016.
 */
public class LoginMethods extends Hook {

    SeleniumMethods smObj = new SeleniumMethods();
    // Hook hobj = new Hook();

    public void OpenUrl() {
        try {
            driver.get("http://application-721436538.ap-northeast-2.elb.amazonaws.com/guesthouseadmin/");
            driver.manage().window().maximize();

        } catch (Exception e) {
            SeleniumMethods.captureScreenShot(driver);
            throw e;
        }


    }

    public void enterUsername(String locatorvalue) {

        smObj.enterText("usernamelocator", locatorvalue);


    }

    public void enterpassword(String locatorvalue) {

        smObj.enterText("passwordlocator", locatorvalue);

    }

    public void submitLoginCredentials() {
        smObj.clickButton("loginlocator");
    }

    public void loginSuccess(String value) throws InterruptedException {
        smObj.verifyTextOnPage("loginsuccessLocator", value);
    }
}

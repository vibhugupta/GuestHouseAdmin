package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.LoginMethods;


/**
 * Created by vibhu on 11/13/2016.
 */
public class Login {

    LoginMethods lmObj = new LoginMethods();

    @Given("^Open Website$")
    public void open_Website() {
        // Write code here that turns the phrase above into concrete actions
        lmObj.driverInitialization();
        lmObj.OpenUrl();
    }

    @When("^user enters the username ([^\\\"]*)$")
    public void user_enters_the_username(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        lmObj.enterUsername(arg1);
    }

    @And("^user enters the password ([^\\\"]*)$")
    public void user_enters_the_password_gupta(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        lmObj.enterpassword(arg1);

    }

    @And("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        lmObj.submitLoginCredentials();
    }

    @Then("^user should be login successfully ([^\\\"]*)$")
    public void user_should_be_login_successfully(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        lmObj.loginSuccess(arg1);
    }

    @Then("^user will logout from website$")
    public void user_will_logout_from_website(){

        lmObj.closeBrowser();
    }
}

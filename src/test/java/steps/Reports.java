package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.ReportMethos;

/**
 * Created by vibhu on 11/15/2016.
 */
public class Reports {

    ReportMethos rmObj = new ReportMethos();
    @Then("^user should see the menu at the side with reports functionality ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_with_reports_functionality_Reports(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        rmObj.user_should_see_the_menu_at_the_side_with_reports_functionality_Reports(arg1);
    }

    @When("^user will click on reports$")
    public void user_will_click_on_reports()  {
        // Write code here that turns the phrase above into concrete actions
        rmObj.user_will_click_on_reports();
    }

    @Then("^user will verify the reports page ([^\\\"]*)$")
    public void user_will_verify_the_reports_page_reports(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        rmObj.user_will_verify_the_reports_page_reports(arg1);
    }
}

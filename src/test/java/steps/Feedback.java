package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.FeedbackMethods;

/**
 * Created by vibhu on 11/15/2016.
 */
public class Feedback {

    FeedbackMethods fbObj = new FeedbackMethods();

    @Then("^user should see the menu at the side with feedback functionality ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_with_feedback_functionality_Feedback(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        fbObj.user_should_see_the_menu_at_the_side_with_feedback_functionality_Feedback(arg1);
    }

    @When("^user will click on feedback")
    public void user_will_click_on_feedback() {
        // Write code here that turns the phrase above into concrete actions
        fbObj.user_will_click_on_feedback();
    }

    @Then("^user will verify the feedback page ([^\\\"]*)")
    public void user_will_verify_the_reports_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        fbObj.user_will_verify_the_feedback_page(arg1);
    }
}

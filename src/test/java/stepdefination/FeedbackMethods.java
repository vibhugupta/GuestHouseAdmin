package stepdefination;

/**
 * Created by vibhu on 11/15/2016.
 */
public class FeedbackMethods {

    SeleniumMethods smObj = new SeleniumMethods();

    public void user_should_see_the_menu_at_the_side_with_feedback_functionality_Feedback(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("feedbacklocatoronadmindashboardmenu",value);

    }


    public void user_will_click_on_feedback() {
        // Write code here that turns the phrase above into concrete actions
smObj.clickButton("feedbacklocatoronadmindashboardmenu");
    }


    public void user_will_verify_the_feedback_page(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        smObj.verifyTextOnPage("feedbacklocatoronfeedbackpage",value);
    }
}

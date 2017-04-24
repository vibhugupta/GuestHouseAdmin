package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.AdminDashboardMethods;

/**
 * Created by vibhu on 11/15/2016.
 */
public class AdminDashboardMenu {

    AdminDashboardMethods admObj = new AdminDashboardMethods();

    @When("^user will click on icon of Admin Dashboard$")
    public void user_will_click_on_icon_of_Admin_Dashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        admObj.user_will_click_on_icon_of_Admin_Dashboard();
    }

    @And("^user will click on next icon$")
    public void user_will_click_on_next_icon_of_choose_option() {
        // Write code here that turns the phrase above into concrete actions
        admObj.user_will_click_on_next_icon_of_choose_option();
    }

    @Then("^user should see the menu at the side for different functionalities ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_for_different_functionalities(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        admObj.user_should_see_the_menu_at_the_side_for_different_functionalities(arg1);
    }
}

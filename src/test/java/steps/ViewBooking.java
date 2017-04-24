package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.ViewBookingMethods;

/**
 * Created by vibhu on 11/15/2016.
 */
public class ViewBooking {

    ViewBookingMethods vbmobj = new ViewBookingMethods();
    @Then("^user should see the menu at the side with view bookings functionality ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_with_view_bookings_functionality_view_bookings(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        vbmobj.user_should_see_the_menu_at_the_side_with_view_bookings_functionality_view_bookings(arg1);
    }

    @When("^user will click on view bookings$")
    public void user_will_click_on_view_bookings() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        vbmobj.user_will_click_on_view_bookings();
    }

    @Then("^user will verify the result with ID ([^\\\"]*)$")
    public void user_will_verify_the_result_with_ID(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        vbmobj.user_will_verify_the_result_with_ID(arg1);
    }
@And("^user will click on location$")
public void user_will_click_on_location_link() throws InterruptedException {
    vbmobj.user_will_click_on_location_link();
}
    @Then("^user will verify the result with location ([^\\\"]*)$")
    public void user_will_verify_the_result_with_location(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        vbmobj.user_will_verify_the_result_with_location(arg1);
    }
}

package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.AccommodationAdminMethods;

/**
 * Created by vibhu on 11/15/2016.
 */
public class AccommodationAdmin {
    AccommodationAdminMethods aaObj = new AccommodationAdminMethods();
    @When("^user will select rooms option$")
    public void user_will_select_rooms_option(){
        // Write code here that turns the phrase above into concrete actions
        aaObj.user_will_select_rooms_option();

    }

    @Then("^user will reach to upcoming guesthouse booking page ([^\\\"]*)$")
    public void user_will_reach_to_upcoming_guesthouse_booking_page_upcoming_guesthouse_booking(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        aaObj.user_will_reach_to_upcoming_guesthouse_booking_page_upcoming_guesthouse_booking(arg1);

    }

    @When("^user will select Satellite Offices option$")
    public void user_will_select_Satellite_Offices_option()  {
        // Write code here that turns the phrase above into concrete actions
        aaObj.user_will_select_satelliteOffice_option();
    }

    @Then("^user will reach to upcoming satellite Office booking page ([^\\\"]*)$")
    public void user_will_reach_to_upcoming_Satellite_Offices_booking_page_upcoming_guesthouse_booking(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        aaObj.user_will_reach_to_upcoming_guesthouse_booking_page_upcoming_guesthouse_booking(arg1);

    }
}

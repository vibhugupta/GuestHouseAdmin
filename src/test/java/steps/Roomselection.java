package steps;

import cucumber.api.java.en.Then;
import stepdefination.RoomSatellieSelectionMethod;
import stepdefination.SeleniumMethods;

/**
 * Created by vibhu on 11/15/2016.
 */
public class Roomselection {
    RoomSatellieSelectionMethod rssmObj = new RoomSatellieSelectionMethod();

    @Then("^user should find room option ([^\\\"]*)$")
    public void user_should_find_room_option_Rooms(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        rssmObj.user_should_find_room_option_Rooms(arg1);

    }

    @Then("^user should find satellite offices option ([^\\\"]*)$")
    public void user_should_find_satellite_offices_option_Satellite_offices(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        rssmObj.user_should_find_satellite_offices_option_Satellite_offices(arg1);
    }
}

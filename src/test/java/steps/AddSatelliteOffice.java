package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.AddRoomGuestHouseMethods;
import stepdefination.AddSatelliteOfficeMethods;
import stepdefination.SeleniumMethods;

/**
 * Created by vibhu on 12/21/2016.
 */
public class AddSatelliteOffice {

    AddRoomGuestHouseMethods arghmObj = new AddRoomGuestHouseMethods();
    AddSatelliteOfficeMethods asomobj = new AddSatelliteOfficeMethods();
    SeleniumMethods smobj = new SeleniumMethods();


    @Then("^user should see the menu at the side with add Satellite Office functionality ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_with_add_Satellite_Office_functionality(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_should_see_the_menu_at_the_side_with_add_Satellite_Office_functionality(arg1);
    }

    @When("^user will click on Add Satellite Office$")
    public void user_will_click_on_Add_Satellite_Office()  {
        // Write code here that turns the phrase above into concrete actions
        smobj.clickButton("addsatelliteofficelocatoronadmindashboard");
    }

    @Then("^Add Satellite Office page should open ([^\\\"]*)$")
    public void add_Satellite_Office_page_should_open_Add_Satellite_Office(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        asomobj.add_Satelliteoffice_page_should_open(arg1);
    }
}

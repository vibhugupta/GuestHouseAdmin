package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.AddRoomGuestHouseMethods;

/**
 * Created by vibhu on 11/15/2016.
 */
public class AddRoomGuestHouse {

    AddRoomGuestHouseMethods arghmObj = new AddRoomGuestHouseMethods();

    @Then("^user should see the menu at the side with add room functionality ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_with_add_room_functionality_Add_Rooms(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_should_see_the_menu_at_the_side_with_add_room_functionality_Add_Rooms(arg1);
    }

    @When("^user will click on Add Rooms$")
    public void user_will_click_on_Add_Rooms() {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_click_on_Add_Rooms();
    }

    @Then("^Add GuestHouse page should open ([^\\\"]*)$")
    public void add_GuestHouse_page_should_openAdd_GuestHouse(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.add_GuestHouse_page_should_openAdd_GuestHouse(arg1);
    }

    @When("^user will enters guest house name in primary details ([^\\\"]*)$")
    public void user_will_enters_guest_house_name_in_primary_details_guest_house_name(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_guest_house_name_in_primary_details_guest_house_name(arg1);
    }


    @And("^user will upload image ([^\\\"]*)$")
    public void user_will_upload_image(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_upload_image(arg1);
    }

    @And("^user will add display picture ([^\\\"]*)$")
    public void user_will_add_display_picture(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_add_display_image(arg1);
    }
    @And("^user will enters contact number in primary details ([^\\\"]*)$")
    public void user_will_enters_contact_number_in_primary_details_contact_number(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_contact_number_in_primary_details_contact_number(arg1);
    }

    @And("^user will enters location in primary details ([^\\\"]*)$")
    public void user_will_enters_location_in_primary_details_location(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_location_in_primary_details_location(arg1);
    }

    @And("^user will enters address in primary details ([^\\\"]*)$")
    public void user_will_enters_address_in_primary_details_address(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_address_in_primary_details_address(arg1);
    }


    @And("^user will enters caretaker name in caretaker details ([^\\\"]*)$")
    public void user_will_enters_caretaker_name_in_caretaker_details_caretaker_name(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_caretaker_name_in_caretaker_details_caretaker_name(arg1);
    }

    @And("^user will enters contact number in caretaker details ([^\\\"]*)$")
    public void user_will_enters_contact_number_in_caretaker_details_caretaker_number(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_contact_number_in_caretaker_details_caretaker_number(arg1);
    }

    @And("^user will add display picture$")
    public void user_will_add_display_picture() {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_add_display_picture();
    }

    @And("^user will clck on save button$")
    public void user_will_clck_on_save_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_clck_on_save_button();
    }

    @Then("^user should get success message ([^\\\"]*)$")
    public void user_should_get_success_messagesuccess_message(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_should_get_success_messagesuccess_message(arg1);
    }


    @When("^user will enter rooms count ([^\\\"]*)$")
    public void user_will_enter_rooms_count(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enter_rooms_count(arg1);
    }

    @When("^user will enters city name ([^\\\"]*)$")
    public void user_will_enters_city_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_city_name(arg1);
    }

    @When("^user will enters sublocality in primary details ([^\\\"]*)$")
    public void user_will_enters_sublocality_in_primary_details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_enters_sublocality_in_primary_details(arg1);
    }

    @When("^user will select Amenity$")
    public void user_will_select_Amenity() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        arghmObj.user_will_select_Amenity();
    }
}

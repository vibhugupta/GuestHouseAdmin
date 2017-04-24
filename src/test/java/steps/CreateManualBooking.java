package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepdefination.CreateManualBookingMethod;


/**
 * Created by vibhu on 12/23/2016.
 */
public class CreateManualBooking {

    CreateManualBookingMethod cmbmobj = new CreateManualBookingMethod();
    @Then("^user should see the menu at the side with create manual booking functionality ([^\\\"]*)$")
    public void user_should_see_the_menu_at_the_side_with_create_manual_booking_functionality(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_should_see_the_menu_at_the_side_with_create_manual_booking_functionality(arg1);
    }

    @When("^user will click on create manual bookings$")
    public void user_will_click_on_create_manual_bookings() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_click_on_create_manual_bookings();
    }

    @Then("^user will verify the result with create manual ([^\\\"]*)$")
    public void user_will_verify_the_result_with_create_manual_booking_label(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_verify_the_result_with_create_manual_label(arg1);
    }

    @And("^user will enter charge code on create manual booking page ([^\\\"]*)$")
    public void user_will_enter_charge_code_on_create_manual_booking_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_enter_charge_code_on_create_manual_booking(arg1);
    }

    @And("^user will enter FMNO on create manual booking page ([^\\\"]*)$")
    public void user_will_enter_FMNO_on_create_manual_booking_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_enter_FMNO_on_create_manual_booking(arg1);
    }
    @And("^user will enter Check In Date on create manual booking page ([^\\\"]*),([^\\\"]*)$")
    public void user_will_enter_Check_In_Date_on_create_manual_booking_page(String arg1, String arg2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_enter_Check_In_Date_on_create_manual_booking(arg1,arg2);
    }

    @And("^user will enter Check Out Date on create manual booking page ([^\\\"]*),([^\\\"]*)$")
    public void user_will_enter_Check_Out_Date_on_create_manual_booking_page(String arg1,String arg2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_enter_Check_Out_Date_on_create_manual_booking(arg1,arg2);
    }

    @And("^user will enter Check In Time on create manual booking page ([^\\\"]*)$")
    public void user_will_enter_Check_In_Time_on_create_manual_booking_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_enter_Check_In_Time_on_create_manual_booking(arg1);
    }

    @And("^user will select city on create manual booking page ([^\\\"]*)$")
    public void user_will_select_city_on_create_manual_booking_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_select_city_on_create_manual_booking(arg1);
    }

    @And("^user will enter nearest location on create manual booking page ([^\\\"]*)$")
    public void user_will_enter_nearest_location_on_create_manual_booking_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_enter_nearest_location_on_create_manual_booking(arg1);
    }

    @And("^user will click on show available guest houses$")
    public void user_will_click_on_show_available_guest_houses() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_click_on_show_available_guest_houses();
    }

    @Then("^list of available guesthouses page should open ([^\\\"]*)$")
    public void user_will_verify_the_available_guesthouses_page(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_verify_the_result_with_available_guesthouses_page(arg1);
    }


    @When("^user will click on book button$")
    public void user_will_click_on_book_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        cmbmobj.user_will_click_on_book_button();
    }
}

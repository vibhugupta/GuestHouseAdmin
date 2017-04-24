package stepdefination;

/**
 * Created by vibhu on 11/15/2016.
 */
public class AccommodationAdminMethods {

    SeleniumMethods smObj = new SeleniumMethods();

    public void user_will_select_rooms_option() {
        // Write code here that turns the phrase above into concrete actions
        smObj.clickButton("chooseviewroomlocator");

    }

    public void user_will_reach_to_upcoming_guesthouse_booking_page_upcoming_guesthouse_booking(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("upcomingguesthousetextlocator",value);

    }

    public void user_will_reach_to_upcoming_guesthouse_booking_page_upcoming_Satellite_Offices_booking(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("upcomingguesthousetextlocator",value);

    }
    public void user_will_select_satelliteOffice_option(){
        smObj.clickButton("chooseviewsatellitelocator");
    }
}

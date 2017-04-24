package stepdefination;

/**
 * Created by vibhu on 11/15/2016.
 */
public class RoomSatellieSelectionMethod {
    SeleniumMethods smObj = new SeleniumMethods();

    public void user_should_find_room_option_Rooms(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("chooseviewroomlocator",value);

    }

    public void user_should_find_satellite_offices_option_Satellite_offices(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("chooseviewsatellitelocator",value);

    }
}

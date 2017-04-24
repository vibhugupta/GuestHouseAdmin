package stepdefination;

/**
 * Created by vibhu on 11/15/2016.
 */
public class ViewBookingMethods {

    SeleniumMethods smObj = new SeleniumMethods();

    public void user_should_see_the_menu_at_the_side_with_view_bookings_functionality_view_bookings(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("viewbookingslocatoronadmindashboardAssert", value);
    }

    public void user_will_click_on_view_bookings() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        smObj.clickButton("viewbookingslocatoronadmindashboard");
        Thread.sleep(1000);
    }

    public void user_will_verify_the_result_with_ID(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(10000);
        smObj.verifyTextOnPage("viewbookingslocatorwithid", value);
    }


    public void user_will_click_on_location_link() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        smObj.clickButton("viewbookingslocatorwithlocationforclick");
    }

    public void user_will_verify_the_result_with_location(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        smObj.verifyTextOnPage("viewbookingslocatorwithlocation", value);
    }
}

package stepdefination;

/**
 * Created by vibhu on 11/15/2016.
 */
public class AdminDashboardMethods {
    SeleniumMethods smObj = new SeleniumMethods();
    public void user_will_click_on_icon_of_Admin_Dashboard() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        smObj.clickButton("admindashboardiconlocator");

    }

    public void user_will_click_on_next_icon_of_choose_option(){
        smObj.clickButton("chooseoptionroomlocator");
    }

    public void user_should_see_the_menu_at_the_side_for_different_functionalities(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("Welcomebacktextlocator",value);

    }
}

package stepdefination;

/**
 * Created by vibhu on 11/15/2016.
 */
public class ReportMethos {

    SeleniumMethods smObj = new SeleniumMethods();
    public void user_should_see_the_menu_at_the_side_with_reports_functionality_Reports(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("reportslocatoronadmindashboardmenu",value);
    }


    public void user_will_click_on_reports()  {
        // Write code here that turns the phrase above into concrete actions
        smObj.clickButton("reportslocatoronadmindashboardmenu");
    }


    public void user_will_verify_the_reports_page_reports(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smObj.verifyTextOnPage("reportslocatoronfeedbackpage",value);
    }
}

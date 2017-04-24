package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by vibhu on 12/21/2016.
 */
public class AddSatelliteOfficeMethods {

    SeleniumMethods smobj = new SeleniumMethods();
    public void add_Satelliteoffice_page_should_open(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smobj.verifyTextOnPage("addsatelliteofficepageverifylocator", value);
    }


}

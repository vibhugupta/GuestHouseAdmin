package stepdefination;

import org.openqa.selenium.By;

import static stepdefination.Hook.driver;

/**
 * Created by vibhu on 11/15/2016.
 */
public class AddRoomGuestHouseMethods {

    SeleniumMethods smobj = new SeleniumMethods();
    UploadFileRobot ufrobj = new UploadFileRobot();

    public void user_should_see_the_menu_at_the_side_with_add_room_functionality_Add_Rooms(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smobj.verifyTextOnPage("addroomlocatoronadmindashboard", value);

    }

    public void user_should_see_the_menu_at_the_side_with_add_Satellite_Office_functionality(String value) throws InterruptedException {
        smobj.verifyTextOnPage("addsatelliteofficelocatoronadmindashboard", value);
    }

    public void user_will_click_on_Add_Rooms() {
        // Write code here that turns the phrase above into concrete actions
        smobj.clickButton("addroomlocatoronadmindashboard");
    }

    public void add_GuestHouse_page_should_openAdd_GuestHouse(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smobj.verifyTextOnPage("addguesthousepageverifylocator", value);
    }
    public void user_will_upload_image(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smobj.clickButton("adddisplaypicturelocator");
        Thread.sleep(1000);
        ufrobj.uploadFile(arg1);
    }

    public void user_will_add_display_image(String arg1) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smobj.clickButton("adddisplaypicturelocator2nd");
        Thread.sleep(1000);
        ufrobj.uploadFile(arg1);
    }
    public void user_will_enters_guest_house_name_in_primary_details_guest_house_name(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousenamelocator", value);
    }

    public void user_will_enters_contact_number_in_primary_details_contact_number(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousecontactnumberlocator", value);
    }

    public void user_will_enters_location_in_primary_details_location(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthouslocationlocator", value);
    }

    public void user_will_enters_address_in_primary_details_address(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthouseaddresslocator", value);
    }

     public void user_will_enters_caretaker_name_in_caretaker_details_caretaker_name(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousecaretakernamelocator", value);
    }

    public void user_will_enters_contact_number_in_caretaker_details_caretaker_number(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousecaretakertnumberlocator", value);
    }

    public void user_will_add_display_picture() {
        // Write code here that turns the phrase above into concrete actions
// need to add code as per used control
    }

    public void user_will_clck_on_save_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(10000);
        smobj.clickButton("savebuttononaddguesthousepagelocator");
        Thread.sleep(30000);
        smobj.clickButton("savebuttononaddguesthouselocator");

    }

    public void user_should_get_success_messagesuccess_message(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        smobj.verifyTextOnPage("successmesagelocatoronAddguesthousepage", value);
        smobj.clickButton("successmesageokbuttonlocator");
    }


    public void user_will_enter_rooms_count(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousebumberofroomslocator", value);
    }


    public void user_will_enters_city_name(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousecitynamelocator", value);
        Thread.sleep(1000);
        String s1 = "//div[text()='";
        s1=s1.concat(value).concat("']");
        System.out.println(s1);
        String s2= "//div[contains(text(),'";
        s2 = s2.concat(value);
        s2 = s2.concat("')]");
        System.out.println(s2);
       // driver.findElement(By.xpath("//div[text()='Noida, Uttar Pradesh, India']")).click();
        try {
            driver.findElement(By.xpath(s1)).click();
        }catch(Exception e){
            Thread.sleep(2000);
            driver.findElement(By.xpath(s2)).click();
        }
       // smobj.clickButton("div/div/div[1]/span/div/div/div");
        Thread.sleep(1000);
    }

    public void user_will_enters_sublocality_in_primary_details(String value) {
        // Write code here that turns the phrase above into concrete actions
        smobj.enterText("guesthousesublocalitylocator", value);
    }


    public void user_will_select_Amenity() {
        // Write code here that turns the phrase above into concrete actions
        smobj.clickButton("firstamenitylocator");
    }
}

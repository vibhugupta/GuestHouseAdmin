package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static stepdefination.Hook.driver;

/**
 * Created by vibhu on 11/15/2016.
 */
public class CreateManualBookingMethod {

    SeleniumMethods smObj = new SeleniumMethods();

    public void user_should_see_the_menu_at_the_side_with_create_manual_booking_functionality(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // Create instance of Javascript executor

        JavascriptExecutor je = (JavascriptExecutor) driver;

        //Identify the WebElement which will appear after scrolling down

        WebElement element = driver.findElement(By.xpath("//span[@class='manual']"));

        // now execute query which actually will scroll until that element is not appeared on page.

        je.executeScript("arguments[0].scrollIntoView(true);", element);

        // Extract the text and verify

        System.out.println(element.getText());
        Thread.sleep(1000);

        smObj.verifyTextOnPage("createmanualbookingslocatoronadmindashboardAssert", value);
    }

    public void user_will_click_on_create_manual_bookings() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        smObj.clickButton("createmanualbookingslocatoronadmindashboard");
    }


    public void user_will_verify_the_result_with_create_manual_label(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(10000);
        smObj.verifyTextOnPage("createmanualbookingslocator", value);
    }


    public void user_will_enter_charge_code_on_create_manual_booking(String value) {

        smObj.enterText("createmanualbookingchargecode", value);
    }

    public void user_will_enter_FMNO_on_create_manual_booking(String value) {
        smObj.enterText("createmanualbookingFMNO", value);
    }

    public void user_will_enter_Check_In_Date_on_create_manual_booking(String month, String date) throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='location']")).click();
        // driver.findElement(By.xpath("//div[@class='loaderBackGround']")).click();
        Thread.sleep(1000);
        //  driver.findElement(By.xpath("//div[@class='toDatePicker']/div/input")).click();
        smObj.clickButton("createmanualbookingcheckindate");
        Thread.sleep(3000);
        String dateValue = "";
        WebElement dateValuelocator = null;
        WebElement dateValuelocator1 = null;
        String monthYear = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div/div/div")).getText();
        if (monthYear.equalsIgnoreCase(month)) {
            int i = 1;

            do {
                int j = 1;
                do {
                    try {
                        dateValuelocator = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[3]/div/div/div[" + i + "]/button[" + j + "]/span"));
                        dateValue = dateValuelocator.getText();
                        System.out.println("date Value is : " + dateValue);
                        System.out.println("date is : " + date);

                        if (date.trim().equalsIgnoreCase(dateValue.trim())) {
                            dateValuelocator1 = dateValuelocator;
                        }
                        System.out.println("dateValuelocator : " + dateValuelocator);
                        System.out.println("dateValuelocator : " + dateValuelocator1);
                        j++;
                    } catch (Exception e) {
                        break;
                    }

                } while (dateValue.equalsIgnoreCase(date) || (j < 8));

                i++;

            } while (dateValue.equalsIgnoreCase(date) || (i < 7));

            dateValuelocator1.click();


        } else {
            do {
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/button[2]")).click();
                Thread.sleep(1000);
                monthYear = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div/div/div")).getText();
            } while (monthYear.equalsIgnoreCase(month));

            Thread.sleep(1000);

            if (monthYear.equalsIgnoreCase(month)){
                System.out.println("Month");
            }else {
                    driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/button[1]")).click();
            }
            int i = 1;

            do {
                int j = 1;
                do {
                    try {
                        dateValuelocator = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[3]/div/div/div[" + i + "]/button[" + j + "]/span"));
                        dateValue = dateValuelocator.getText();
                        //   if (dateValue.equalsIgnoreCase("25")) {
                        if (dateValue.trim().equalsIgnoreCase(date.trim())) {
                            dateValuelocator1 = dateValuelocator;
                        }
                        System.out.println("........... " + dateValue);
                        j++;
                    } catch (Exception e) {
                        break;
                    }

                } while (dateValue.equalsIgnoreCase(date) || (j < 8));
                i++;
            } while (dateValue.equalsIgnoreCase(date) || (i < 6));
            Thread.sleep(1000);
            dateValuelocator1.click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[2]/button[2]/div/span")).click();

    }

    public void user_will_enter_Check_Out_Date_on_create_manual_booking(String month, String date) throws InterruptedException {
        // smObj.dateOrTimeSelect("createmanualbookingcheckoutdate", value);
        Thread.sleep(1000);
        smObj.clickButton("createmanualbookingcheckoutdate");
        Thread.sleep(3000);
        String dateValue = "";
        WebElement dateValuelocator = null;
        WebElement dateValuelocator1 = null;
        String monthYear = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div/div/div")).getText();
        if (monthYear.equalsIgnoreCase(month)) {
            int i = 1;

            do {
                int j = 1;
                do {
                    try {
                        dateValuelocator = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[3]/div/div/div[" + i + "]/button[" + j + "]/span"));
                        dateValue = dateValuelocator.getText();
                        if (dateValue.trim().equalsIgnoreCase(date.trim())) {
                            dateValuelocator1 = dateValuelocator;
                        }
                        System.out.println("........... " + dateValue);
                        j++;
                    } catch (Exception e) {
                        break;
                    }

                } while (dateValue.equalsIgnoreCase(date) || (j < 8));
                i++;
            } while (dateValue.equalsIgnoreCase(date) || (i < 7));

            dateValuelocator1.click();


        } else {
            do {
                Thread.sleep(1000);
                driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/button[2]")).click();
                Thread.sleep(1000);
                monthYear = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/div/div/div")).getText();
            } while (monthYear.equalsIgnoreCase(month));
            //           driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[3]/div/div/div[5]/button[1]/span")).click();
            Thread.sleep(1000);
            if (monthYear.equalsIgnoreCase(month)){
                System.out.println("Month");
            }else {
                driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/button[1]")).click();
            }
           // driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[1]/button[1]")).click();
            int i = 1;

            do {
                int j = 1;
                do {
                    try {
                        dateValuelocator = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[1]/div[3]/div/div/div[" + i + "]/button[" + j + "]/span"));
                        dateValue = dateValuelocator.getText();
                        if (dateValue.trim().equalsIgnoreCase(date.trim())) {
                            dateValuelocator1 = dateValuelocator;
                        }
                        System.out.println("........... " + dateValue);
                        j++;
                    } catch (Exception e) {
                        break;
                    }

                } while (dateValue.equalsIgnoreCase(date) || (j < 8));
                i++;
            } while (dateValue.equalsIgnoreCase(date) || (i < 7));
            Thread.sleep(1000);
            dateValuelocator1.click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[2]/button[2]/div/span")).click();

    }

    public void user_will_enter_Check_In_Time_on_create_manual_booking(String value) throws InterruptedException {
        //   smObj.dateOrTimeSelect("createmanualbookingcheckintime", value);
        //smObj.enterText("createmanualbookingcheckintime", value);
        Thread.sleep(1000);
        smObj.clickButton("createmanualbookingcheckintime");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div/div[2]/button[2]/div/span")).click();
    }

    public void user_will_select_city_on_create_manual_booking(String value) throws InterruptedException {


        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='location']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='citySection']/div[2]/div)[1]")).click();
        Thread.sleep(1000);
        WebElement element = null;
        String s1 = "";
        int i = 1;
        int xpathcitylen = driver.findElements(By.xpath("//div[@style='opacity: 1;']")).size();
        do {

            s1 = driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[" + i + "]/span/div/div/div")).getText();
            if (s1.equalsIgnoreCase(value)) {

                element = driver.findElement(By.xpath("/html/body/div[8]/div/div/div/div[" + i + "]/span"));

            }
            i++;

      //  } while (!s1.equalsIgnoreCase("vijayawada") || i < xpathcitylen-1);
        } while (!s1.equalsIgnoreCase(value) || i < xpathcitylen-1);
        Thread.sleep(1000);

        element.click();



    }

    public void user_will_enter_nearest_location_on_create_manual_booking(String value) throws InterruptedException {
        Thread.sleep(1000);
        smObj.enterText("createmanualbookingnearestlocation", value);
    }

    public void user_will_click_on_show_available_guest_houses() {
        smObj.clickButton("createmanualbookingshowavailableguesthouse");
    }

    public void user_will_verify_the_result_with_available_guesthouses_page(String value) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(10000);
        smObj.verifyTextOnPage("createmanualbookingavialableGuesthousePage", value);
    }

    public void user_will_click_on_book_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        smObj.clickButton("createmanualbookingbookbutton");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='okManaul']")).click();
    }
}


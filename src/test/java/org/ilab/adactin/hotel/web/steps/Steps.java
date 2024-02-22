package org.ilab.adactin.hotel.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.ilab.adactin.hotel.web.base.BaseTest;
import org.ilab.adactin.hotel.web.pages.HotelListPage;
import org.ilab.adactin.hotel.web.pages.LoginPage;
import org.ilab.adactin.hotel.web.pages.SearchHotelPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Steps extends BaseTest {

    LoginPage loginPage;
    SearchHotelPage searchHotelPage;
    HotelListPage hotelListPage;

    /*******************************************************************************
     *Adactin Hotel Home page steps definition
     *******************************************************************************
     */

    @Given("browser is launched")
    public void browser_is_launched() {
        setUpPage();
    }

    @And("Adactin Hotel build two {string} is open")
    public void adactin_hotel_build_two_is_open(String url) {
        openThePage(url);
    }

    @Then("verify login page is open and it is build two")
    public void verify_login_page_is_open_and_it_is_build_two() {
        loginPage = new LoginPage(driver);
        assertTrue(loginPage.setVerifyLoginPageOpenBuildTwo()
                , "Login page is open and its Build Two");
    }

    @And("close the browser")
    public void close_the_browser() {
        tearDownPage();
    }


    /*****************************************************************************
     *Adactin Hotel Login page Steps definition
     *****************************************************************************
     */

    @When("^user enters (.*) and (.*)$")
    public void user_enters_and_(String username, String password) {
        loginPage.setUsernameInputField(username);
        loginPage.setPasswordInputField(password);
    }

    @And("chick on login button")
    public void chick_on_login_button() {
        searchHotelPage = new SearchHotelPage(driver);
        searchHotelPage = loginPage.setLoginButtonField();
    }

    @Then("verify user logged in successfully")
    public void verify_user_logged_in_successfully() {
        assertTrue(searchHotelPage.setVerifyUserLoggedIn()
                , "User login not successful");
    }


    /************************************************************************
     *Adactin Hotel Search Hotel Steps definition
     ************************************************************************
     */

    @And("^select the (.*) and (.*)$")
    public void select_the_and_(String location, String hotel) {
        searchHotelPage.setLocationField(location);
        searchHotelPage.setHotelField(hotel);
    }

    @And("^select room (.*) and number of (.*)$")
    public void select_room_and_number_of_(String roomType, String numberOfRooms) {
        searchHotelPage.setRoomTypeField(roomType);
        searchHotelPage.setNumberOfRoomsField(numberOfRooms);
    }

    @When("^enters check in (.*) and check out (.*)$")
    public void enters_check_in_and_check_out_(String checkInDate, String checkOutDate) {
        searchHotelPage.setCheckInDateInputField(checkInDate);
        searchHotelPage.setCheckOutDateInputField(checkOutDate);
    }

    @And("^select how many Adults per room (.*) and Children per room (.*)$")
    public void select_how_many_adults_per_room_and_children_per_room(String adultPerRoom, String childPerRoom) {
        searchHotelPage.setAdultPerRoomField(adultPerRoom);
        searchHotelPage.setChildPerRoomField(childPerRoom);
    }

    @And("click on search button")
    public void click_on_search_button(){
        hotelListPage = new HotelListPage(driver);
        hotelListPage = searchHotelPage.setSearchButtonField();
    }

    @Then("verify if list of Hotels or Hotel is displayed")
    public void verify_if_list_of_hotels_or_hotel_is_displayed(){
        assertTrue(hotelListPage.setVerifyHotelListPage()
                , "Hotel list is not displaying");
    }

    @And("verify name in the form")
    public void verify_name_in_the_form() {
        //assertTrue(searchHotelPage.setSelectedHotelName(hotel),"Hotel Name is not the same");
        System.out.println("whats happening");
    }
}

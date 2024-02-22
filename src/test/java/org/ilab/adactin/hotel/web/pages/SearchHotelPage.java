package org.ilab.adactin.hotel.web.pages;

import org.ilab.adactin.hotel.web.utils.SelectMethod;
import org.ilab.adactin.hotel.web.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {


    private final WebDriver driver;

    WaitHelper waitHelper;

    SelectMethod selectMethods;

    @FindBy(id = "location")
    @CacheLookup
    WebElement locationField;

    @FindBy(id = "hotels")
    @CacheLookup
    WebElement hotelField;

    @FindBy(id = "room_type")
    @CacheLookup
    WebElement roomTypeField;

    @FindBy(id = "room_nos")
    @CacheLookup
    WebElement numberOfRoomsField;

    @FindBy(id = "datepick_in")
    @CacheLookup
    WebElement checkInDateInputField;

    @FindBy(id = "datepick_out")
    @CacheLookup
    WebElement checkOutDateInputField;

    @FindBy(id = "adult_room")
    @CacheLookup
    WebElement adultPerRoomField;

    @FindBy(id = "child_room")
    @CacheLookup
    WebElement childPerRoomField;

    @FindBy(id = "Submit")
    @CacheLookup
    WebElement searchButtonField;

    @FindBy(xpath = "//td[text()=\"Welcome to Adactin Group of Hotels\"]")
    @CacheLookup
    WebElement verifyUserLoggedIn;


    public SearchHotelPage(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
        selectMethods = new SelectMethod(driver);
        PageFactory.initElements(driver, this);
    }

    public void setLocationField(String location) {
        waitHelper.waitForElementToDisplay(locationField, 20);
        selectMethods.selectMethodByValue(locationField, location);
    }

    public void setHotelField(String hotel) {
        waitHelper.waitForElementToDisplay(hotelField, 20);
        selectMethods.selectMethodByValue(hotelField, hotel);
    }

    public void setRoomTypeField(String roomType) {
        waitHelper.waitForElementToDisplay(roomTypeField, 20);
        selectMethods.selectMethodByValue(roomTypeField, roomType);
    }

    public void setNumberOfRoomsField(String numberOfRooms) {
        waitHelper.waitForElementToDisplay(numberOfRoomsField, 20);
        selectMethods.selectMethodByValue(numberOfRoomsField, numberOfRooms);
    }

    public void setCheckInDateInputField(String checkInDate) {
        waitHelper.waitForElementToDisplay(checkInDateInputField, 20);
        checkInDateInputField.clear();
        checkInDateInputField.sendKeys(checkInDate);
    }

    public void setCheckOutDateInputField(String checkOutDate) {
        waitHelper.waitForElementToDisplay(checkOutDateInputField, 20);
        checkOutDateInputField.clear();
        checkOutDateInputField.sendKeys(checkOutDate);
    }

    public void setAdultPerRoomField(String adultPerRoom) {
        waitHelper.waitForElementToDisplay(adultPerRoomField, 20);
        selectMethods.selectMethodByValue(adultPerRoomField, adultPerRoom);
    }

    public void setChildPerRoomField(String childPerRoom) {
        waitHelper.waitForElementToDisplay(childPerRoomField, 20);
        selectMethods.selectMethodByValue(childPerRoomField, childPerRoom);
    }

    public HotelListPage setSearchButtonField() {
        waitHelper.waitForElementToDisplay(searchButtonField, 20);
        searchButtonField.click();
        return new HotelListPage(driver);
    }

    public boolean setVerifyUserLoggedIn() {
        waitHelper.waitForElementToDisplay(verifyUserLoggedIn, 20);
        return verifyUserLoggedIn.isDisplayed();
    }
}

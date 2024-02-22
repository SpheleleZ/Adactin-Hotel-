package org.ilab.adactin.hotel.web.pages;

import org.ilab.adactin.hotel.web.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelListPage {


    private final WebDriver driver;

    WaitHelper waitHelper;

    @FindBy(xpath = "//td[text()=\"Welcome to Adactin Group of Hotels\"]")
    @CacheLookup
    WebElement verifyHotelListPage;

    @FindBy(id = "hotel_name_0")
    @CacheLookup
    WebElement selectedHotelName;

    @FindBy(id = "location_0")
    @CacheLookup
    WebElement selectedLocation;

    @FindBy(id = "rooms_0")
    @CacheLookup
    WebElement selectedNumberOfRooms;

    @FindBy(id = "arr_date_0")
    @CacheLookup
    WebElement enteredCheckInDate;

    @FindBy(id = "dep_date_0")
    @CacheLookup
    WebElement enteredCheckOutDate;

    @FindBy(id = "no_days_0")
    @CacheLookup
    WebElement selectedNumberOfDays;

    @FindBy(id = "room_type_0")
    @CacheLookup
    WebElement selectedRoomType;


    public HotelListPage(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean setVerifyHotelListPage() {
        waitHelper.waitForElementToDisplay(verifyHotelListPage, 20);
        return verifyHotelListPage.isDisplayed();
    }

    public boolean setSelectedHotelName(String hotel){
        waitHelper.waitForElementToDisplay(selectedHotelName,20);
        return selectedHotelName.getAttribute("value").contains(hotel);
    }
}

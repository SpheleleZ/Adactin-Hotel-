package org.ilab.adactin.hotel.web.pages;

import org.ilab.adactin.hotel.web.utils.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private final WebDriver driver;
    WaitHelper waitHelper;

    @FindBy(id = "username")
    @CacheLookup
    WebElement usernameInputField;

    @FindBy(id = "password")
    @CacheLookup
    WebElement passwordInputField;

    @FindBy(id = "login")
    @CacheLookup
    WebElement loginButtonField;

    @FindBy(xpath = "//td[text()=\"Existing User Login - Build 2\"]")
    @CacheLookup
    WebElement verifyLoginPageOpenBuildTwo;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        waitHelper = new WaitHelper(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUsernameInputField(String username) {
        waitHelper.waitForElementToDisplay(usernameInputField, 20);
        usernameInputField.clear();
        usernameInputField.sendKeys(username);
    }

    public void setPasswordInputField(String password) {
        waitHelper.waitForElementToDisplay(passwordInputField, 20);
        passwordInputField.clear();
        passwordInputField.sendKeys(password);
    }

    public boolean setVerifyLoginPageOpenBuildTwo() {
        waitHelper.waitForElementToDisplay(verifyLoginPageOpenBuildTwo, 20);
        return verifyLoginPageOpenBuildTwo.isDisplayed();
    }

    public SearchHotelPage setLoginButtonField() {
        waitHelper.waitForElementToDisplay(loginButtonField, 20);
        loginButtonField.click();
        return new SearchHotelPage(driver);
    }
}

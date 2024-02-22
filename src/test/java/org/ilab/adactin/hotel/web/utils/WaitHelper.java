package org.ilab.adactin.hotel.web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {

    protected WebDriver driver;
    public WaitHelper(WebDriver driver){
        this.driver = driver;
    }

    public void waitForElementToDisplay(WebElement element, long timeOutInSecond){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSecond));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

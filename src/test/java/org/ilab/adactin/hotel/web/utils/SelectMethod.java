package org.ilab.adactin.hotel.web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod {
    protected WebDriver driver;

    public SelectMethod(WebDriver driver){
        this.driver = driver;
    }

    public void selectMethodByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }
}

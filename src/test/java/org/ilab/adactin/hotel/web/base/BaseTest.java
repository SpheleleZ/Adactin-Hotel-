package org.ilab.adactin.hotel.web.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    public void setUpPage(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void openThePage(String url){
        driver.get(url);
    }

    public void tearDownPage(){
        driver.quit();
    }
}

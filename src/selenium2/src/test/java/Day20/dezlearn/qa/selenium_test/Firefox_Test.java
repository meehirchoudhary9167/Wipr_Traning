package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Test {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Meehir\\Downloads\\geckodriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        
        driver.quit();
    }
}

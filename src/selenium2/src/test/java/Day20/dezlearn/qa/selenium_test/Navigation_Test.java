package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Test {
public static void main(String[] args) {
        
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meehir\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.navigate().to("https://www.youtube.com");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        driver.navigate().to("https://www.instagram.com");
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();

        
        driver.quit();
}
}

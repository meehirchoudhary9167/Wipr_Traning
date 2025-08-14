package com.dezlearn.qa.selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Xpath {
public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meehir\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//input[@aria-label='first-name']")).sendKeys("hello");
        driver.findElement(By.xpath("//input[@aria-label='last-name']")).sendKeys("world");
        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("hello@gmail.com");
         

} 
}

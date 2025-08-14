package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_page_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Meehir\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com");
         System.out.println(driver.getCurrentUrl());
         System.out.println(driver.getPageSource());
         System.out.println(driver.getTitle());
         System.out.println(driver.getWindowHandle());


	}

}

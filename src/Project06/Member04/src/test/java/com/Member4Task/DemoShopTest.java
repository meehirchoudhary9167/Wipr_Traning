package com.Member4Task;

//import com.reports.listeners.TestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class DemoShopTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        TestListener.setDriver(driver);
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void testTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Demo Web Shop"); // Will pass
    }

    @Test
    public void testSearchBoxExists() {
        Assert.assertTrue(driver.findElement(By.id("small-searchterms")).isDisplayed(),
                "Search box should be visible on Demo Web Shop home page");
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

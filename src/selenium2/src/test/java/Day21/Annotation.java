package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.*;

public class Annotation {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void beforesuite() {
        System.out.println("start of the suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before the start suite");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("launching the suite");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("this is navigation browser");
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    public void verifyPage() {
        System.out.println("page is display");
    }

    @Test
    public void LoginTest() {
        System.out.println("login details");
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Login ']"))).click();
        String Expectedtitle="OrangeHRM";
		String Actualtitle=driver.getTitle();
		Assert.assertEquals(Actualtitle, Expectedtitle,"title is mismatched");
		Assert.assertTrue(true);

        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Logout");
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("closing browser");
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After the test method work");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After the suit it run");
    }
}


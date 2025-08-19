package Day25;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class NopCommereceParallelExecution {

    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        return new Object[][] {
            {"firstuser" + System.currentTimeMillis() + "@gmail.com", "NewUser@1234"}
        };
    }

    @Test(dataProvider = "userData", invocationCount = 3, threadPoolSize = 2, priority = 1)
    public void signUpToNopCommerce(String email, String password) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Thread " + Thread.currentThread().getId() + " - SignUp with " + email);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male"))).click();
        driver.findElement(By.id("FirstName")).sendKeys("UserFirstName");
        driver.findElement(By.id("LastName")).sendKeys("UserLastName");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Company")).sendKeys("UserCompany");
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button"))).click();

        System.out.println("Thread " + Thread.currentThread().getId() + " - SignUp successful for " + email);
        driver.quit();
    }

    @Test(dataProvider = "userData", invocationCount = 3, threadPoolSize = 2, priority = 2)
    public void loginToNopCommerce(String email, String password) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println("Thread " + Thread.currentThread().getId() + " - Login with " + email);

        driver.findElement(By.name("Email")).sendKeys(email);
        driver.findElement(By.name("Password")).sendKeys(password);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        System.out.println("Thread " + Thread.currentThread().getId() + " - Login successful for " + email);
        driver.quit();
    }
}


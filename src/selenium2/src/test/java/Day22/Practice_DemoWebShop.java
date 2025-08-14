
package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice_DemoWebShop {
    
    WebDriver driver;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void launchWebShop(String browserName, String url) {
        System.out.println("Launching Demo Web Shop in browser: " + browserName);

        switch (browserName) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "FireFox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser specified. Defaulting to Chrome.");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test(groups = {"smoke"})
    public void logIn() {
        System.out.println("Testing LogIn functionality.");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
        driver.findElement(By.id("Email")).sendKeys("marvel01@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("IronMan");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log in']"))).click();
    }

    @Test(groups = {"regression"})
    public void clickBook() {
        System.out.println("Testing Books button.");
        driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/books']")).click();
    }
}

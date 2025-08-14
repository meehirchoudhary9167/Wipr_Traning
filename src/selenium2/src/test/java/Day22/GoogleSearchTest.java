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

public class GoogleSearchTest {

    WebDriver driver;

    @Parameters({"browserName", "url"})
    @BeforeClass
    public void launchBrowser(String browserName, String url) {
        System.out.println("Launching browser: " + browserName);

        switch (browserName) {
            case "Chrome":
                driver = new ChromeDriver();
                break;
            case "Firefox":
                driver = new FirefoxDriver();
                break;
            case "Edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser specified. Defaulting to Chrome.");
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);
    }

    @Test(groups = {"smoke"})
    public void searchTest() {
        System.out.println("Running Google search test.");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.name("q"))).sendKeys("Selenium WebDriver");
        driver.findElement(By.name("q")).submit();
    }

    @Test(groups = {"regression"})
    public void clickFirstResult() {
        System.out.println("Clicking first search result.");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until first search result appears and click it
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3"))).click();
    }
}

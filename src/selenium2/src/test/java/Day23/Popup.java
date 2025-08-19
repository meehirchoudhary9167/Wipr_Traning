package Day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Popup {
	WebDriver driver;

	public void waitAndClosePopup() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    try {
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("popup-id")));
	        popup.findElement(By.cssSelector(".close-button")).click();
	    } catch (Exception e) {
	        System.out.println("Popup did not appear");
	    }
	}


}

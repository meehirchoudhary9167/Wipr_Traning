package Day25;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class RegistrationFormTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @DataProvider(name = "formData")
    public Object[][] getData() throws IOException {
        FileInputStream file = new FileInputStream("testdata.xlsx"); // keep Excel in project root
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet1");

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount - 1][colCount];

        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < colCount; j++) {
                data[i - 1][j] = row.getCell(j).toString();
            }
        }
        workbook.close();
        file.close();
        return data;
    }

    @Test(dataProvider = "formData")
    public void fillForm(String firstName, String lastName, String email, String gender,
                         String mobile, String dob, String subject, String hobbies, String address) {

        // Fill first name
        WebElement fName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
        fName.clear();
        fName.sendKeys(firstName);

        // Last name
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys(lastName);

        // Email
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys(email);

        // Gender
        driver.findElement(By.xpath("//label[text()='" + gender + "']")).click();

        // Mobile
        driver.findElement(By.id("userNumber")).clear();
        driver.findElement(By.id("userNumber")).sendKeys(mobile);

        // Date of Birth (simple way: clear and send keys)
        WebElement dobInput = driver.findElement(By.id("dateOfBirthInput"));
        dobInput.click();
        dobInput.clear();
        dobInput.sendKeys(dob);
        dobInput.sendKeys("\n");

        // Subject
        WebElement subjectBox = driver.findElement(By.id("subjectsInput"));
        subjectBox.sendKeys(subject);
        subjectBox.sendKeys("\n");

        // Hobbies
        driver.findElement(By.xpath("//label[text()='" + hobbies + "']")).click();

        // Address
        driver.findElement(By.id("currentAddress")).clear();
        driver.findElement(By.id("currentAddress")).sendKeys(address);

        // Submit
        driver.findElement(By.id("submit")).click();

        // Validation (popup modal)
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("example-modal-sizes-title-lg")));
        System.out.println("Form submitted successfully for: " + firstName + " " + lastName);

        // Close modal
        driver.findElement(By.id("closeLargeModal")).click();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

package com.Member4Task;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static String captureScreenshot(WebDriver driver, String testName) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String destPath = System.getProperty("user.dir") + "/reports/screenshots/" + testName + ".png";
        File destFile = new File(destPath);

        try {
            destFile.getParentFile().mkdirs(); // Create directory if not exists
            Files.copy(srcFile.toPath(), destFile.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destPath;
    }
}

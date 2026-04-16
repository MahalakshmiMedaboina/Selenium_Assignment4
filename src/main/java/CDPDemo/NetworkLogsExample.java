package main.java.CDPDemo;

import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.LogEntry;

public class NetworkLogsExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\ChromeDriver121\\chromedriver-win64\\chromedriver.exe");

        // Enable performance logging
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Chrome121\\chrome-win64\\chrome.exe");

        options.setCapability("goog:loggingPrefs", logPrefs);

        WebDriver driver = new ChromeDriver(options);

        System.out.println("BROWSER LAUNCHED");

        driver.get("https://www.google.com");

        // Capture logs
        for (LogEntry entry : driver.manage().logs().get(LogType.PERFORMANCE)) {
            System.out.println(entry.getMessage());
        }

        driver.quit();
    }
}
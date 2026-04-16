package main.java.CDPDemo;

import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.logging.LogEntry;

public class CaptureResponseExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\ChromeDriver121\\chromedriver-win64\\chromedriver.exe");

        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Chrome121\\chrome-win64\\chrome.exe");
        options.setCapability("goog:loggingPrefs", logPrefs);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        for (LogEntry entry : driver.manage().logs().get(LogType.PERFORMANCE)) {

            String log = entry.getMessage();

            // Filter response logs
            if (log.contains("Network.responseReceived")) {
                System.out.println("RESPONSE: " + log);
            }
        }

        driver.quit();
    }
}
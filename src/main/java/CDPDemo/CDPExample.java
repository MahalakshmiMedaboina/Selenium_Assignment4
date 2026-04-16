package main.java.CDPDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CDPExample {

    public static void main(String[] args) {

        // ✅ Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
                "C:\\ChromeDriver121\\chromedriver-win64\\chromedriver.exe");

        // ✅ Set Chrome binary (portable Chrome 121)
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Chrome121\\chrome-win64\\chrome.exe");

        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        System.out.println("STARTING TEST...");

        // ✅ Launch browser
        WebDriver driver = new ChromeDriver(options);

        System.out.println("BROWSER LAUNCHED");

        // ✅ Open website
        driver.get("https://www.google.com");

        // Wait to observe browser
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ✅ Close browser
        driver.quit();
    }
}
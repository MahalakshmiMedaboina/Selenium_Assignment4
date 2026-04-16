package main.java.CDPDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BlockRequestsExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\ChromeDriver121\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Chrome121\\chrome-win64\\chrome.exe");

        // ✅ Block images
        options.addArguments("--blink-settings=imagesEnabled=false");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.com");

        System.out.println("Page loaded without images");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        driver.quit();
    }
}
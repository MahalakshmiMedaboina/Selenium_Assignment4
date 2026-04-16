package CDP;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MobileEmulationExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\ChromeDriver121\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Chrome121\\chrome-win64\\chrome.exe");

        // ✅ Set mobile device
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone X");

        options.setExperimentalOption("mobileEmulation", mobileEmulation);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.com");

        System.out.println("Mobile view opened");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        driver.quit();
    }
}
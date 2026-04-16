package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // ✅ Username & Password in URL
        String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";

        driver.get(url);

        System.out.println("Authentication handled successfully");

        try { Thread.sleep(5000); } catch (Exception e) {}

        driver.quit();
    }
}
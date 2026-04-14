package gridDemo;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GridTest {

    public static void main(String[] args) {

        try {
            ChromeOptions options = new ChromeOptions();

            WebDriver driver = new RemoteWebDriver(
                    new URL("http://localhost:4444"),
                    options
            );

            driver.get("https://www.google.com");

            System.out.println("Title: " + driver.getTitle());

            Thread.sleep(3000);

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

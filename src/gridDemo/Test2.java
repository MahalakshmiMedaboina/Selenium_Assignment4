package gridDemo;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testBing() throws Exception {

        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444"),
                options
        );

        driver.get("https://www.bing.com");
        System.out.println("Test2 Title: " + driver.getTitle());

        Thread.sleep(5000);

        driver.quit();
    }
}

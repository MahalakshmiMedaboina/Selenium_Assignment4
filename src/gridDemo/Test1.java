//package gridDemo;
//
//import java.net.URL;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;
//
//public class Test1 {
//
//    @Test
//    public void testGoogle() throws Exception {
//
//        ChromeOptions options = new ChromeOptions();
//
//        WebDriver driver = new RemoteWebDriver(
//                new URL("http://localhost:4444"),
//                options
//        );
//
//        driver.get("https://www.google.com");
//        System.out.println("Test1 Title: " + driver.getTitle());
//
//        Thread.sleep(5000);
//
//        driver.quit();
//    }
//}

//-------------------------------------------------------------

package gridDemo;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test1 {

    // ✅ Main method (required for Jenkins execution)
    public static void main(String[] args) {
        try {
            Test1 obj = new Test1();
            obj.testGoogle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ✅ Actual test method
    public void testGoogle() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // for headless execution
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new RemoteWebDriver(
                new URL("http://localhost:4444"),
                options
        );

//        driver.get("https://www.google.com");
        String url = System.getProperty("URL"); //for parameterized build in jenkins
        driver.get(url);

        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(5000);

        driver.quit();
    }
}

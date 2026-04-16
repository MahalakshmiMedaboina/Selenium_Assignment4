package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver",
//                "C:\\ChromeDriver121\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        // ✅ File path (change this to your file)
        String filePath = "C:\\Users\\medab\\OneDrive\\Desktop\\test.txt";

        // ✅ Upload file
        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        // ✅ Click upload button
        driver.findElement(By.id("file-submit")).click();

        System.out.println("File uploaded successfully");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {}

        driver.quit();
    }
}
package main.java.Utilities;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDownloadExample {

    public static void main(String[] args) {

        String downloadPath = "C:\\Users\\medab\\Downloads";

        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("sample.txt")).click();

        System.out.println("Download started...");

        try { Thread.sleep(5000); } catch (Exception e) {}

        File file = new File(downloadPath + "\\sample.txt");

        if (file.exists()) {
            System.out.println("File downloaded successfully ✅");
        } else {
            System.out.println("File NOT downloaded ❌");
        }

        driver.quit();
    }
}
package com.proj.automation.tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWebsiteTest {
	
	@Test
    public void openWebsiteAndCapture() {

        try {

            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");
            options.addArguments("--window-size=1920,1080");

            WebDriver driver = new ChromeDriver(options);

            // buka website
            driver.get("https://www.google.com");

            // tunggu halaman load
            Thread.sleep(3000);

            // ambil screenshot
            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshots/homepage.png");

            FileUtils.copyFile(src, dest);

            System.out.println("Screenshot berhasil disimpan");

            driver.quit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

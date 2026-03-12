package com.proj.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	 public static WebDriver createDriver(){

	        WebDriverManager.chromedriver().setup();

	        ChromeOptions options = new ChromeOptions();

	        options.addArguments("--headless=new");
	        options.addArguments("--window-size=1920,1080");

	        WebDriver driver = new ChromeDriver(options);

	        return driver;
	    }

}

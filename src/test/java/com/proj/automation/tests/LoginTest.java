package com.proj.automation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.proj.automation.base.DriverFactory;
import com.proj.automation.page.LoginPage;
import com.proj.automation.util.ScreenshotUtil;

public class LoginTest {
	 @Test
	    public void loginTest(){

	        WebDriver driver = DriverFactory.createDriver();

	        try{

	            driver.get("http://localhost:8080/login");

	            LoginPage login = new LoginPage(driver);

	            login.login("admin","123456");

	            String title = driver.getTitle();

	            Assert.assertTrue(title.contains("Dashboard"));

	        }catch(Exception e){

	            ScreenshotUtil.capture(driver,"login_error");

	        }finally{

	            driver.quit();

	        }

	    }

}

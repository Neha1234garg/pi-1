package com.project.Reporter;


import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;
import com.appdirect.Pages.*;



public class AppTest 
{
	public WebDriver driver;
	
	Properties p1 = new Properties();
	
	ReadDBfile f1= new ReadDBfile();
	
	SelectBrowser b1= new SelectBrowser();
	@BeforeTest
	public void selectBrowser()
	{
		p1= f1.getProp();
		String browser = p1.getProperty("browser_name");
		driver= b1.browser1(browser);
		String url = p1.getProperty("url");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   	
		 System.out.println(url);
		 driver.get(url);
		
	}
	
	
	@Test
	public void verifyLogin(){

   	 	extra ob = new extra(driver);
   	 	ob.getloginLink();
   	 	ob.getSignupLink();
   	 	
	}
	
	
}

package com.appdirect.Pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectBrowser{
	
	WebDriver driver=null;
	
	Properties p1 = new Properties();
	
	ReadDBfile f1= new ReadDBfile();
	//FileInputStream input = new FileInputStream(new File())
	public WebDriver browser1(String browser)
	{
		p1=f1.getProp();
		
		String d_path = p1.getProperty("driver_path");
		String d_name = p1.getProperty("driver_name");
		
		if(browser.equalsIgnoreCase("chromebrowser"))
		{
			System.setProperty(d_path,d_name); 
			driver = new ChromeDriver();	
			return driver;
		}
		else if(browser.equalsIgnoreCase("firefoxbrowser"))
		{
			driver = new FirefoxDriver();	
			return driver;
		}
	return driver;
		
}
}
	



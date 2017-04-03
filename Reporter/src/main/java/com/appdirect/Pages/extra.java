package com.appdirect.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class extra 
{
    	WebElement element1;
    	
    	WebDriver driver;
    	Properties p1 = new Properties();
    	
    	ReadDBfile f1= new ReadDBfile();
    	
    	public extra(WebDriver driver)
    	{
    		this.driver=driver;
    	}
    	
    	public void getloginLink()
    	{
    		p1= f1.getProp();
    		
    		By loginlink = By.linkText(p1.getProperty("loginlink_link_Text"));
        	
    		driver.findElement(loginlink).click();
    	}
    
    	public void getSignupLink()
    	{
    		p1= f1.getProp();
    		By signuplink = By.xpath(p1.getProperty("signuplink_xpath"));
    		driver.findElement(signuplink).click();
    	}
}
    	


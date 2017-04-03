package com.appdirect.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDBfile {
	
	
	 Properties prop = new Properties();
	 FileInputStream input = null;
	 public Properties getProp(){
		 try {
			input = new FileInputStream(new File("db.properties"));
			// load a properties file
			prop.load(input);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
			
			
	 }
	
	
}
	
	



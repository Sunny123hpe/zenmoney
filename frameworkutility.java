package com.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameworkutility {

	public static WebDriver driver;
	public static Properties prop;
	
	public void initialisedriver()
	{
		driver=new ChromeDriver();
	}
	
	public void login(String key) throws IOException
	{
		driver.get(getpropdata(key));
		driver.get(prop.getProperty("URL"));
	}
	
	public String getpropdata(String key) throws IOException
	{
		prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/config.properties");
		prop.load(ip);
		String val=prop.getProperty(key);
		return val;
	}
	
	
	
}

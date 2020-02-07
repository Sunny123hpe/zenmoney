package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utility.Basepage;

public class Loginpage extends Basepage{

		
		public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


		@FindBy(xpath = "//input[@name='email']")
		private WebElement usename;
		
		@FindBy(xpath = "//input[@name='pass']")
		private WebElement psw;
		
		@FindBy(xpath = "//button[@name='login']")
		private WebElement submit;
		
		public void login(String user,String Psw) throws Exception
		{
			user=readConfiguration(Constants.propertiesFilePath, "username");
			Psw=readConfiguration(Constants.propertiesFilePath, "password");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Psw);
			driver.findElement(By.xpath("//input[@value='Log In']")).click();
			
			
		}
		
		
		
		public void poststatus(String mes)
		{
			driver.findElement(By.xpath("//div[contains(text(),'Write something here')]")).sendKeys(mes);
			driver.findElement(By.xpath("//span[text()='Post']")).click();
		}
		
		
		
		

	}



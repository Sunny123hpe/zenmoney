package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends frameworkutility{
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement usename;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement psw;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement submit;
	
	public void login(String user,String Psw)
	{
		user=prop.getProperty("username");
		Psw=prop.getProperty("Pswr");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(prop.getProperty(Psw));
		driver.findElement(By.xpath("//button[@name='login'")).click();
		
	}
	
	
	public void poststatus(String mes)
	{
		driver.findElement(By.xpath("//div[contains(text(),'Write something here')]")).sendKeys(mes);
		driver.findElement(By.xpath("//span[text()='Post']")).click();
	}
	
	
	
	

}

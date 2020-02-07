
package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage extends FrameworkUtility {

	public static WebDriver driver;

	public Basepage(WebDriver driver) {
		setALLDriver(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
}

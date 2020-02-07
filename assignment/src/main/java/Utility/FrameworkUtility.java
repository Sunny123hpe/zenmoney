
package Utility;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FrameworkUtility {

	public static WebDriver driver;
	protected static Properties properties;
	protected static String browserName;
	public WebDriverWait wait;
	public Properties pr;
	public JavascriptExecutor js;
	

		public void clickonElement(WebElement webelement) {
		webelement.click();

	}

	
	public String GetText(WebElement webelement) {
		return webelement.getText();

	}

	// Enter the text
	public void entertext(WebElement webelement, String value) {
		webelement.clear();
		webelement.sendKeys(value);
	}
	 
	public String readConfiguration(String filePath, String property) throws Exception {
		pr = new Properties();
		// read the path of properties file FileReader fr = new
		FileReader fr = new FileReader(filePath);

		// load the path read to properties
		pr.load(fr);

		// pass the key value to be read from properties file as an argument
		String configRead = pr.getProperty(property);

		// if key value is not found in properties file, it throws runtime exception
		if (configRead == null) {
			throw new RuntimeException("property specified is not found in configuration properties file");
		}

		// return the key value being read from properties file
		return configRead;
	}

	
	 
	public void initilizeLocalDriver() throws Exception {

		Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();

        // Set the experimental option
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", Constants.driverPath);

	
		driver = new ChromeDriver(options);

		
		driver.manage().window().maximize();

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(readConfiguration(Constants.propertiesFilePath, "UATurl"));
		setALLDriver(driver);
	}
	
	public void initObjects() {
		try {
			js = (JavascriptExecutor) driver;
			wait = new WebDriverWait(driver, 10);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void setDriver(WebDriver driver) {
	
		this.driver = driver;
	}

	public void setALLDriver(WebDriver driver) {
		setDriver(driver);
		initObjects();
	}

	

}

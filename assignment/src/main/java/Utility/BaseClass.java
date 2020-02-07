

package Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass extends FrameworkUtility
{
	


	
	
	@BeforeClass(alwaysRun=true)
	public void setUp() throws Exception
	{
		 
		initilizeLocalDriver();
	  }
	
	
	
	
	
	

	@AfterClass
	public void closeApplication(){
		try
		{
		driver.quit();
	}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
	
	
	}
	
	
	
	


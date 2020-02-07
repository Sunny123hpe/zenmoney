package assignment;
import org.testng.annotations.Test;

import com.pom.Loginpage;

import Utility.BaseClass;


public class testcase extends BaseClass{
	
	@Test
	public void Testcase()
	{
		Loginpage L=new Loginpage(driver);
		L.login("Sunny", "PSW");
		L.poststatus("HELLO WORLD!!");
	}

}
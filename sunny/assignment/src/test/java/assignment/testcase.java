package assignment;



import org.testng.annotations.Test;

import com.pom.Loginpage;
import com.pom.frameworkutility;

public class testcase extends frameworkutility{
	
	@Test
	public void Testcase()
	{
		Loginpage L=new Loginpage();
		L.login("Sunny", "PSW");
		L.poststatus("HELLO WORLD!!");
	}

}

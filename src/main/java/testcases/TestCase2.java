package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void validateString() {
		
		String Actual = "Satyan Sayani"; // from Selenium code
		String Expected = "Satyan Sayani" ;// from exel
				
		Assert.assertEquals(Actual, Expected);
				
	}
	

}

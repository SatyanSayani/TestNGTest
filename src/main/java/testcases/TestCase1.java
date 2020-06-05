package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	
	//public static String browser1 = "firefox";
	public static WebDriver driver1;
	

	
	/*
	 * @BeforeTest public void openDBconnection() {
	 * 
	 * System.out.println("DB Connection now open"); }
	 * 
	 * @AfterTest public void closeDBconnection() {
	 * 
	 * System.out.println("DB Connection now closed"); }
	 */
	
	@BeforeTest
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.get("http://gmail.com/");
		
				
		System.out.println("Browser successfully launched");
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		System.out.println("Browser is now closing");
		driver1.quit();
	}
	
	@Test(priority= 1)
	public void doLogin() {
		
		System.out.println("Just Test 1");
		
	}
	
	
}

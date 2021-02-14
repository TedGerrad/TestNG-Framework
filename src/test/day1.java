package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class day1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	// To verify the title of target pages of two links 
	
		
		public String baseUrl = "http://demo.guru99.com/test/newtours/"; 
		String driverPath  = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver2.exe"; 
		public WebDriver driver;
		public String expected = null;
		public String actual = null;
		@BeforeTest 
		public void launchBrowser() {
			System.out.println("Launching Chrome Browser");
			System.setProperty("webdriver.chrome.driver",driverPath); 
			driver = new ChromeDriver(); 
			driver.get(baseUrl);
		}
		
		@BeforeMethod
		public void verifyHomepageTitle() {
			String expected = "Welcome: Mercury Tours";
			String actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 0)
		public void register() {
			driver.findElement(By.linkText("REGISTER")).click();
			expected = "Register: Mecury Tours";
			actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}
		@Test(priority = 1)
		public void support() {
			driver.findElement(By.linkText("SUPPORT")).click();
			expected = "Under Construction: Mercury Tours"; 
			actual = driver.getTitle();
			Assert.assertEquals(actual, expected);
		}
		
		@AfterMethod 
		public void goBackToHomepage() {
			driver.findElement(By.linkText("Home")).click();
		}
		
		@AfterTest 
		public void terminateBrowser() {
			driver.close();
		}
	}

//}

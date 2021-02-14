package firsttestngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	
	@BeforeMethod
	public void premethod() {
		System.out.println("I will execute before every test method in this class is executed");
	}
	
	@AfterMethod
	public void postmethod() {
		System.out.println("I will be executed after every test method within the class is executed");
	}
	
	@Test(groups = {"Smoke"})
	public void WebloginHomeLoan() {
		//selenium code to login to web application 
		System.out.println("webloginhome");
	}
	
	@Test
	public void MobileLoginHomeLoan() {
		//Appium 
		System.out.println("MobileLoginginHomeLoan");
	}
	
	@Test 
	public void loginAPIHomeLoan() {
		//test API automation
		System.out.println("loginAPIHomeLoan");
	}
}

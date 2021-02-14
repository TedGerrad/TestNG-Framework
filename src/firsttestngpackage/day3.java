package firsttestngpackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class day3 {
	
	@Test(groups = {"Smoke"})
	public void WeblogincarLoan() {
		//selenium code to login to web application 
		System.out.println("weblogincarLoan");
	}
	
	@BeforeTest(enabled = false )
	public void prerequisite() {
		System.out.println("I will execute before all tests at the class level");
	}
	
	
	@Test(groups = {"Smoke"})
	public void MobileLogincarLoan() {
		//Appium 
		System.out.println("MobileLogingincarLoan");
	}
	
	@AfterTest
	public void postrequisite() {
		System.out.println("I will execute after all the tests at the class level");
	}
	
	@Test(dataProvider="getData")
	public void MobileLogoutcarLoan(String uname, String pword) {
		//Appium 
		System.out.println("MobileLogoutcarLoan");
		System.out.println(uname);
		System.out.println(pword);
	}
	
@Parameters({"URL","username"})
	@Test
	public void MobileEditcarLoan(String urlname, String key) {
		//Appium 
		System.out.println("MobileEditcarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Parameters({"URL"})
	@Test 
	public void APIlogincarLoan(String urlname) {
		//test API automation
		System.out.println("APILogincarLoan");
		System.out.println(urlname);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username/password-good credit history
		//2nd-username/password-no credit history
		//3rd- fraudulent credit history
		Object[][] data = new Object [3][2];
		//When defining the dimension of the array, consider the size strictly in terms of rows and columns as integer values of the array and not index values 
		//1st set
		data[0][0]= "firstusername";
		data[0][1]="firstpword";
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpword";
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpword";
		return data;
	}
}

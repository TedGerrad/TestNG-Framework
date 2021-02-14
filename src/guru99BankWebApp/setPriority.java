package guru99BankWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*Scenario: Generate a code where you are required to perform a Google search 
with a specific keyword say "Facebook". Now, verify that Browser title is changed
 to "Facebook - Google Search".
 */
public class setPriority {
	public WebDriver driver; 
	String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
	
	//open google Chrome 
	@Test (priority=1)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",driverPath); 
		driver = new ChromeDriver();
	}

	//launch google.com
	@Test (priority=2)
	public void launchGoogle() {
		driver.get("http://www.google.co.in");
	}
	
	//perform facebook search
	@Test (priority=3)
	public void peformSeachAndClick1stLink() {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Facebook");
	}
	
	//Verify Google search page title
	@Test (priority=4)
	public void FacebookPageTitleVerification() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);
	}
}


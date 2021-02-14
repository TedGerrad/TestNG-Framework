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
public class fbscenario {
	public WebDriver driver;
	public String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe"; 
	
	//Method 1: Open Browser say Google (openBrowser())
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",driverPath);  
		driver = new ChromeDriver();
		}
	

	//Method 2: Launch Google.com (launchGoogle())
	@Test
	public void launchGoogle() {
		driver.get("http://www.google.co.in");
	}

	//Method 3: Perform a search using "Facebook" (performSearchAndClick1stLink())
	@Test
	public void performSearchAndClick1stLink() {
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Facebook");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
	}
	
	//Method 4: Verify Google search page title (FaceBookPageTitleVerification())
	@Test
	public void FaceBookPageTitleVerification() throws Exception {
		driver.findElement(By.xpath("/html/head/title")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle().contains("facebook - Google Search"), true);
	}
	
}


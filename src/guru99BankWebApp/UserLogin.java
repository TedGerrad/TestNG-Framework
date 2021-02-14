package guru99BankWebApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Navigate to homepage
		String baseURL = "http://www.demo.guru99.com/V4/"; 
		//String driverPath = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\chromedriver3.exe";
		String driverPath  = "C:\\Users\\TED GERRAD ARIAGA\\eclipse-workspace\\software\\geckodriver2.exe";
	
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver;
		driver = new FirefoxDriver();
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		/*
		 * Chrome Browser user login
		System.setProperty("webdriver.chrome.driver", driverPath); 
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get(baseURL);
		*/
		
		//2. Enter user credentials 
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr278136");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("YtUqEdY");
		
		//Login with credentials
		driver.findElement(By.cssSelector("body > form:nth-child(21) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)")).click();
		
		//Validate Login 
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText());
	}

}

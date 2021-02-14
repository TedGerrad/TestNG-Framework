package firsttestngpackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class day1 {

	
		// TODO Auto-generated method stub
	 
		@BeforeSuite
		public void hlprerequisite() {
			System.out.println("I will execute first at the suite level before any tests/methods on the class level are executed");	
			
		}
		
		@AfterSuite
		public void hlpostrequisite() {
			System.out.println("I will be executed last at the suite level before any tests/methods at the class level are executed");
		}
		
		@Parameters({"URL","Pword"})
		@Test
		public void Demo(String urlname, String access) {
			System.out.println("Hello");
			System.out.println(urlname);
			System.out.println(access);
			
		}
		
		
		@Test
		public void SecondTest() {
			System.out.println("Goodbye");
		}
	}



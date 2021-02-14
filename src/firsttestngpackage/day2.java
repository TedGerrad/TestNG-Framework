package firsttestngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day2 {

	
	@Test (groups = {"Smoke"})
	public void ploan() {
		System.out.println("good");
		Assert.assertTrue(false);
	}
	
}

package sdetTestacse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test7 {

	
	@Test
	public void test7() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}

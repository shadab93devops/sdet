package sdetTestacse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	
	@Test
	public void testall() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
	}
}

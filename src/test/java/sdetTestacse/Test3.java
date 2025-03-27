package sdetTestacse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {

	
	@Test
	public void test3() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=_NGLNvF3D-A&t=388s&ab_channel=SDET-QA");
	}
}

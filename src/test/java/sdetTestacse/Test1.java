package sdetTestacse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
public void test() {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	System.out.println("hello");
}
}

package sdetTestacse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stale {

	
	
	@Test
	public void staleexception() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	WebElement username = driver.findElement(By.id("name"));
	driver.navigate().refresh();
	username = driver.findElement(By.id("name"));
	username.sendKeys("shadab");
	}
}

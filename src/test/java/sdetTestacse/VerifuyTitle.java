package sdetTestacse;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifuyTitle {

	
	
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("hello",Keys.ENTER);
	String Title=	driver.getTitle();
		
		assertNotEquals(Title, "hello - Google Search","title missmatch");
		
	}
	
	
	
	@Test
	public void verifySoftassert() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("hello",Keys.ENTER);
	String Title=	driver.getTitle();
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(Title, "hello - Google Search","title missmatch");
		
		softassert.assertAll("assertion fali");
		System.out.println("soft assert");
	}
}

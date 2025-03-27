package sdetTestacse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 {

	
	private WebElement value;

	@Test
	public void webtable() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		
WebElement value=	driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr[1]/td[1]"));
	System.out.println(value.getText());
	WebElement checkbox = driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr[1]/td[4]"));
	checkbox.click();
	
	}
}

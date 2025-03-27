package sdetTestacse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5 {

	
	
	@Test
	public void retrivedata() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		
		int rows = driver.findElements(By.xpath("//table[@id=\"simpletable\"]/tbody/tr")).size();
	int column=driver.findElements(By.xpath("//table[@id=\"simpletable\"]/tbody/tr[1]/td")).size();
	WebElement data = driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr[1]/td[1]"));
	System.out.println(data.getText());
	
	
	
	for(int r=1;r<=rows;r++) {
		for(int c=1;c<=column;c++) {
			WebElement data1 = driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr["+r+"]/td[1]"));
	
	
	if(data1.getText().equals("Yashwanth")) {
		WebElement data2 = driver.findElement(By.xpath("//table[@id=\"simpletable\"]/tbody/tr["+r+"]/td["+c+"]"));
	System.out.print(	data2.getText() +" ");
	}
		}
		
	}
	}
}

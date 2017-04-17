package AalimPak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AalimCls {  
	
	@Test 
	public void myMet2()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SoftwareTesting\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	
	driver.navigate().to("https://www.facebook.com");
	
	Select sel=new Select(driver.findElement(By.id("day")));
	
	sel.selectByIndex(5);
	
	Select sel1=new Select(driver.findElement(By.id("month")));
	
	sel1.selectByVisibleText("Apr");
	
	Select sel2=new Select(driver.findElement(By.id("year")));
	
	sel2.selectByVisibleText("1992");
	
	driver.findElement(By.id("u_0_h")).click();
	
	driver.quit();
	
	


	
	
	//driver.findElement(By.id("u_0_1")).sendKeys("Nurali");
	
	//driver.findElement(By.id("u_0_3")).sendKeys("Virani");
	
	//driver.findElement(By.id("u_0_6")).sendKeys("noorali143@yahoo.co.in");
	
	
	//driver.findElement(By.id("u_0_d")).sendKeys("Abcdefgh.");
	
	//driver.findElement(By.id("day")).sendKeys("13");
	
	//driver.quit();
	
	//driver.findElement(By.id("month")).sendKeys("09");
	
	//driver.findElement(By.id("year")).sendKeys("1980");
	
	//driver.findElement(By.className("_58mt")).click();
	
	
	

	
	
	
	
	
	}
	
	
}

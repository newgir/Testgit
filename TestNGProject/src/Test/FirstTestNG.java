package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
  @Test
  public void f() throws Exception  {
	  
	  WebDriver driver;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	
		driver.get("https://demoqa.com/alerts/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("alertButton")).click();
		
		//driver.findElement(By.id("confirmButton")).click();
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(1000);
		
		Alert alert = driver.switchTo().alert(); 
				
		alert.sendKeys("students");
		alert.accept();
		//alert.dismiss();
		
		Thread.sleep(2000);
		
		driver.quit();
  }
}

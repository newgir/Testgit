package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SeleniumwithJavaTestng {
	
	WebDriver driver;
	
  
  @BeforeClass
  public void PageLaunch() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	
		driver.get("https://demoqa.com/alerts/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("alertButton")).click();
		
		//driver.findElement(By.id("confirmButton")).click();
		
		
  }
  
  @Test
  public void f() throws Exception {
	  
	  
	  driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(1000);
	  Alert alert = driver.switchTo().alert(); 
		
		alert.sendKeys("students");
		alert.accept();
		//alert.dismiss();
		
		Thread.sleep(2000);
		
  }

  @AfterClass
  public void CloseBrowser() {
	  
	  driver.quit();
  }

}

package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before Suite");
		  System.out.println("New Code Addednkjnkn1");
		 
		  
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class");
		  System.out.println("Test");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method");
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }
	  
	  @Test
	  public void f() {
		  
		  System.out.println("Test");
	  }
	  
	  @Test
	  public void f2() {
		  
		  System.out.println("Test");
	  }
 
	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test");
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After Class");
	  }
  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite");
	  }

}

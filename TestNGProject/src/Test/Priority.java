package Test;

import org.testng.annotations.Test;

public class Priority {
	
	
  @Test(groups= {"smoke"})
  public void login() {
	  System.out.println("Print login page");
  }
  
  @Test(groups= {"smoke","regression"})
  public void Image() {
	  System.out.println("Print Image");
  } 
  
  
  @Test(groups= {"sanity"})
  public void password() {
	  System.out.println("check pwd");
  } 
}

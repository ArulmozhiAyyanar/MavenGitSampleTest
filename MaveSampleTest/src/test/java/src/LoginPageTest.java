package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver=new ChromeDriver();
	  
	  driver.get("http://10.67.89.42/Common/Login.aspx");
	  Thread.sleep(3000);
	  String pageTitle=driver.getTitle();
	  System.out.println("ti: "+pageTitle);
	  Assert.assertEquals(pageTitle,"In Essence Bank");
	//  driver.quit();
  }
}

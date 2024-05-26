package Fresh;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver dr;
	Actions ac;
	//Here we are writing @parameter because to do crossbrowser testing
  @Parameters({"browser"})
  @BeforeMethod
  public void lunch(String browser) throws InterruptedException 
  {
	  switch (browser.toLowerCase()) 
	  {
	case "chrome":
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	    dr = new ChromeDriver();
	    ac = new Actions(dr);
		dr.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		dr.manage().window().maximize(); 
//		//for verify expected with actual value using assert class
//		String expectedtitle = "OrangeHRM";
//		String actualtitle = dr.getTitle();
//		Assert.assertEquals(expectedtitle, actualtitle);
		
		Reporter.log("lunch success",true);
		//System.out.println("lunch success");
		break;
	case "firefox":
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
	    dr = new FirefoxDriver();
	    ac = new Actions(dr);
		dr.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		dr.manage().window().maximize(); 
		Reporter.log("lunch success",true);
		//System.out.println("lunch success");
		break;

	default:
		dr = null;
		break;
	}
	  
	 
		
  }  
  @Test(description = "verify login",priority = 1,enabled = true) 
  public void login() throws InterruptedException 
  {
	    

		 //select username
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		dr.findElement(By.id("btnLogin")).click();	; 
		
  }

  @AfterMethod
  public void logout() 
  {
	  ac.moveToElement(dr.findElement(By.xpath("//a[@id='welcome']"))).click().perform();;
	  ac.moveToElement(dr.findElement(By.xpath("//*[@href='/symfony/web/index.php/auth/logout']"))).click().perform();
	//*[contains(text(),'Logout')]
  }

}

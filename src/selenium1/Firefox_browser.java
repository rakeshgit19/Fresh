package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firefox_browser {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
	
		//This code is for handling browser notification
		WebDriver driver;
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permisions.default.desktop-notification", 2);
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(FirefoxDriver.PROFILE, profile);
		driver = new FirefoxDriver(cap);
		
		//this is for IRCTC
		//FirefoxDriver driver = new FirefoxDriver();
		/*driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='ng-tns-c14-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@class='fa fa-angle-right']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement>calendar = driver.findElements(By.xpath("//div[@class='ng-tns-c14-6 ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-shadow ng-trigger ng-trigger-overlayState']/table//td"));
		int s = calendar.size();*/
		
		//this is for redbus
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='src']")).clear();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//li[@class='selected'][contains(text(),'New Delhi')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dest']")).clear();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//li[contains(text(),'Bengaluru')]")).click();
		
		   //WebDriverWait wait = new WebDriverWait(driver, 30);
		   //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("onward_cal")));
		
		Thread.sleep(1000);
		//for ONWARDDATE table
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<WebElement>calender = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table//td"));
		int s = calender.size();
		
		for (int i = 0; i < s; i++) 
		{
			try
			{
			  
			  String date = calender.get(i).getText();
			  if (date.equalsIgnoreCase("10")) 
			  {
			
				calender.get(i).click();
				
			  }
			}
			catch (Exception e) 
			{
				//System.out.println(e.getMessage());
			}
		}
		
		 Thread.sleep(1000);
		 //for RETURNDATE table
		 driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-return-calendar icon']")).click();
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     //click arrow button
	     //driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		 List<WebElement>calender1 = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table//td"));
		 int s1 = calender1.size();
		 
		 for (int i = 0; i < s1; i++) 
			{
				try
				{
				  
				  String date1 = calender1.get(i).getText();
				  if (date1.equalsIgnoreCase("30")) 
				  {
				
					calender1.get(i).click();
					
				  }
				}
				catch (Exception e) 
				{
					//System.out.println(e.getMessage());
				}
			}
		  Thread.sleep(2000);
		  //clicking search button
		  driver.findElement(By.cssSelector("#search_btn")).click();
		

	}

}

package grid.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Selenium_Grid1 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{

		WebDriver driver;
		DesiredCapabilities cap;
		String url = "http://orangehrm.qedgetech.com";
		
		
			//driver = new ChromeDriver();
			//System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
			cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			
			
			//connecting to hub
			cap.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL("http://172.20.10.5:34304/wd/hub"), cap);
			driver.get(url);
			driver.manage().window().maximize();
			
		
	
	
			driver.findElement(By.name("txtUsername")).sendKeys("Admin");
			driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
			driver.findElement(By.name("Submit")).click();
			
		
			
			driver.quit();
		


	}

}

package practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Revision23 
{

	public static void main(String[] args) throws AWTException, InterruptedException
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Robot r = new Robot();
		
		//WebElement object = driver.findElement(By.xpath(""));
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		//ac.sendKeys(Keys.ARROW_DOWN).perform();
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		ac.sendKeys(Keys.PAGE_UP).perform();

	}

}

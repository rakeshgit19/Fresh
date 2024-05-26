package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Revision16
{

	public static void main(String[] args)
	{


		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//close.banner window
		ac.sendKeys(Keys.ESCAPE).perform();
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='_3AqyYH']//a[1]//img[1]"))).click();
		
		
		ac.perform();
		
		

	}

}

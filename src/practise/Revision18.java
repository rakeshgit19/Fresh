package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Revision18 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//store slider
		WebElement object = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		WebElement sliderbar = driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
		
		//now calculate x and y offset
		int x = sliderbar.getLocation().getX();
		int y = sliderbar.getLocation().getY();
		System.out.println("x coordinate is ="+x+""+"y coordinate is ="+y);
		
		//now move slider
		ac.dragAndDropBy(object, 100, 0).perform();
		Thread.sleep(2000);
		ac.dragAndDropBy(object, -50,0).perform();
		Thread.sleep(2000);
		

	}

}

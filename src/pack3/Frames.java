package pack3;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.navigate().to("https://paytm.com/");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/div[4]/div")).click();;
	Thread.sleep(2000);
	//System.out.println(a);
	//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//get collection of frames
	//List<WebElement>olist = driver.findElements(By.tagName("iframe"));
	//System.out.println("no of frames are ="+olist.size());
		
	///html/body/div[1]/div/div[6]/div[2]	
	///html/body/div[1]/div/div[2]/div[2]/div[3]/div[4]/div
	//html/body/div[1]/div/div[2]/div[2]/div[3]/div[4]/div
		//(_3ac-)
	
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent().close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

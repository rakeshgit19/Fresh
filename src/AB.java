import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AB 
{

	public static void main(String[] args) throws Exception  
	{
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.tutorialspoint.com/about/about_careers.htm");
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
//		try {
//			
//			driver.findElement(By.xpath("//[@class='_26Vr']")).click();
//		} catch (Exception e) {
//			throw new Exception("Locator is wrong");
//		}
//		
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		// Keys.Chord string
	     // String newtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		//String newtab = Keys.chord(Keys.CONTROL,Keys.RETURN);
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	   //   driver.findElement(By.xpath("//*[text()='Terms of Use']")).sendKeys(newtab);
	     // driver.findElement(By.linkText("www.facebook.com")).sendKeys(newtab);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);  
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		ArrayList<String>lists = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		System.out.println(lists);
		driver.switchTo().window(lists.get(1));
		
		Thread.sleep(2000);
		driver.get("https://facebook.com");
	      
	      
	}

}

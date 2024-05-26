package pack4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Downloadfile_usingrobotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		//create object for Robot class
		Robot r = new Robot();
		
		//click on download version
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[3]/a")).click();
		
		//focus on window
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.close();

	}

}

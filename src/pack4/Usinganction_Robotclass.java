package pack4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Usinganction_Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:google.com");
		driver.manage().window().maximize();
		 
		//create object to perform action
		Actions ac = new Actions(driver);
		
		//configure robot class
		Robot r = new Robot();
		
		//right click on gmail link in google page
		ac.moveToElement(driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"))).contextClick().perform();
		
		//press down arrow in keyboard
		r.keyPress(KeyEvent.VK_DOWN);
		
		//release down arrow in keyboard
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		//press enter key in keyboard
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}

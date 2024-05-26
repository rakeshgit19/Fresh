package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchto_frame16 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//create object for action to access methods
		Actions ac = new Actions(driver);
		
		
		
		//get collection of frames
		List<WebElement>frames = driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames ="+frames.size());
		
		//switch to parent frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//aside[1]/ul/li[5]/a")).click();
		
		
		
		//switch to frame no 16
		//driver.switchTo().frame(16);
		

	}

}

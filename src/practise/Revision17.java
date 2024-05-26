package practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Revision17 
{

	public static void main(String[] args) 
	{
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//click and hold the object and drop it in destination folder
		//ac.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().perform();
		WebElement object = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		//get x and y offset
		int x = destination.getLocation().getX();
		int y = destination.getLocation().getY();
		System.out.println("x coordinate is ="+x+""+"y coordinate is ="+y);
		
		//now drag and drop the element
		ac.dragAndDropBy(object, 140, 10).perform();

	}

}

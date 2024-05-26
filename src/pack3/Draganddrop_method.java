package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//create object for action to access methods
		Actions ac = new Actions(driver);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//now store the element which we want to access
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		
		//now drag the element and drop it on the destination
		ac.dragAndDrop(src, dst).release().perform();
		Thread.sleep(3000);
		
		//verify dst contains 'dropped' or not
		if (dst.getText().contains("Dropped!")) 
		{
		
			System.out.println("drag and drop success");
		}
		else {
			System.out.println("drag and drop unsuccess");
		}
		driver.close();
		
		
		
		

	}

}

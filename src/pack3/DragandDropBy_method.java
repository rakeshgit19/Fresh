package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropBy_method {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		//create object for action to access methods
		Actions ac = new Actions(driver);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//now store the element which we want to access
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		
		//get x and y coordinates of 'dst' for dropping src in x and y coordinate
		int x = dst.getLocation().getX();
		int y = dst.getLocation().getY();
		System.out.println("x coordinate="+x);
		System.out.println("y coordinate="+y);
		
		//now drag and drop the element to dst folder
		ac.dragAndDropBy(src, x, y).perform();
		Thread.sleep(3000);
		driver.close();
		
				
		
		
		
		
		
		
		
		
		
		

	}

}

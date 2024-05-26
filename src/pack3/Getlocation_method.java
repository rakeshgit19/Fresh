package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Getlocation_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		//create object for action to access methods
		Actions ac = new Actions(driver);
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//store 'slider ' into webelement to access the method
		WebElement slider = driver.findElement(By.xpath("/html/body/div/span"));
		
		//drag the slider forward
		ac.dragAndDropBy(slider, 300, 0).perform();
		Thread.sleep(3000);
		
		//drag the slider backward
		ac.dragAndDropBy(slider, -200, 0).perform();
		driver.close();
		
		
		
		

	}

}

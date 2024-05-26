package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//create object for action to access methods
		Actions ac = new Actions(driver);
		
		//close banner window in flipkart page
		ac.sendKeys(Keys.ESCAPE).perform();
		
		//mouse hover to electronics
		ac.moveToElement(driver.findElement(By.xpath("//div/ul/li[1]/span")));
		ac.click();
		ac.perform();
		Thread.sleep(3000);
		
		//mouse hover to mouse link and click
		ac.moveToElement(driver.findElement(By.xpath("//li[1]/ul/li/ul/li[3]/ul/li[10]/a")));
		ac.click();
		ac.perform();
		Thread.sleep(3000);
		
		//verify mouse text found in mouse page or not
		//so for printing mouse text first we have to store the text 
		String mousetext = driver.findElement(By.xpath("//h1[text()='Mouse']")).getText();
		if (mousetext.equalsIgnoreCase("mouse"))
		{
		
			System.out.println("text is found ="+mousetext);
		}
		else {
			System.out.println("text is not found ="+mousetext);
		}
		driver.close();
		
		
		
		
		

	}

}

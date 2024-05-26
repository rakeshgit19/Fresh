package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision6 
{

	public static void main(String[] args) throws InterruptedException 
	{


		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("");
		driver.manage().window().maximize();
		
		//store firstname testbox and verify is it enabled or not
		WebElement firstname = driver.findElement(By.id(""));
		boolean name = firstname.isEnabled();
		boolean textbox = firstname.isDisplayed();
		System.out.println(name);
		System.out.println(textbox);
		
		//store reenter mobile textbox and verify it is displayed or not
		WebElement reenter = driver.findElement(By.id(""));
		boolean mtextbox = reenter.isDisplayed();
		boolean tbbox = reenter.isEnabled();
		
		//enter some text
		reenter.sendKeys("");
		Thread.sleep(2000);
		firstname.sendKeys("");
		Thread.sleep(2000);
		firstname.isDisplayed();
		
		//store mailradiobutton into webelement and verify maleradionutton is selected or not
		WebElement mailradiobutton = driver.findElement(By.id(""));
		boolean radiobutton = mailradiobutton.isSelected();
		System.out.println(radiobutton);
		
		//if male radiobutton is not selected then select it
		if (!mailradiobutton.isSelected()) 
		{
			
			mailradiobutton.click();
		}
		

	}

}

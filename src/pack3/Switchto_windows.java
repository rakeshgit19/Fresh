package pack3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchto_windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//launching facebook application in firefox browser
		driver.navigate().to("http://facebook.com/");
		
		//print parent window's unique id value
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		//click on terms link to open in new window
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		
		//get collection of windows unique id of both parent and child
		Set<String>allwins = driver.getWindowHandles();
		System.out.println(allwins);
		
		//giving control to child window
		for(String each:allwins)
		{
			//parent window should not equal to child window
			if(!parent.equals(each))
			{
				//switch to child
				driver.switchTo().window(each);
				
				//click on signup button in child window
				driver.findElement(By.xpath("//div/div/span/a")).click();
				Thread.sleep(5000);
					
			}
		}
		
		
		//switch back to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		
		//now find username and password and fill data abnd click login button
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rakesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']//following::input[1]")).sendKeys("rakesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}

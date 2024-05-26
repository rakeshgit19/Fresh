package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_usingchrome1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		//creating instance object for browser class
		ChromeDriver driver=new ChromeDriver();
		
		//launch url in browser
		driver.get("http://facebook.com");
		//driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.name("email")).sendKeys("rakesh.gentle20@gmail.com");
		
		////enter password
		driver.findElement(By.id("pass")).sendKeys("   ");
		
		
		//click login button
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);
		driver.close();
			
				
		
	}

}

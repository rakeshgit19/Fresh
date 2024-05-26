package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_usingchrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		//creating instance object for browser class
		ChromeDriver driver=new ChromeDriver();
		
		//launch url in browser
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//enter password
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		
		//click login button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.close();
	
		

	}

}

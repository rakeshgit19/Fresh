package pack2;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_usingfirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		//create an instance object for firefox browser class
		FirefoxDriver driver=new FirefoxDriver();
		
		//for launching url in browser
		driver.get("http://orangehrm.qedgetech.com");
		driver.manage().window().maximize();
		
		//set username for url
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//set password for url
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		
		//click login button
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(6000);
		//for close the page
		driver.close();
		

		
		
	}

}

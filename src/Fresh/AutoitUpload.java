package Fresh;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(2000);
		dr.manage().window().maximize();

		//select username
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		dr.findElement(By.id("btnLogin")).click();
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("firstName")).sendKeys("Rakesh");
		dr.findElement(By.id("middleName")).sendKeys("Kumar");
		dr.findElement(By.id("lastName")).sendKeys("Dalai");
		dr.findElement(By.id("employeeId")).clear();
		dr.findElement(By.id("employeeId")).sendKeys("45678");
		Thread.sleep(2000);		
		
		//dr.findElement(By.xpath("//input[@id='photofile']")).click();;
		//as locator is unable to identify photofile button so we are using auto it to click
		//photofile button
		Runtime.getRuntime().exec("C:\\Users\\CHANDAN\\Desktop\\Script for Button Clicking.exe");
		Thread.sleep(5000);	
		//script for photo uploading
		Runtime.getRuntime().exec("C:\\Users\\CHANDAN\\Desktop\\Script for Upload Image3.exe");
		

	}

}

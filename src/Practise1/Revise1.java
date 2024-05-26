package Practise1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise1 
{

	public static void main(String[] args) 
	{
		
		//to login a application using chrome
		System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.navigate().to("http://primusbank.qedgetech.com/");
		dr.manage().window().maximize();
		dr.findElement(By.id("txtuId")).sendKeys("Admin");
		dr.findElement(By.id("txtPword")).sendKeys("Admin");
		dr.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		//verify login success or not
		String expval = dr.getCurrentUrl();
		String actval = "Admin";
		if (expval.contains(actval.toLowerCase())) 
		{
		
			System.out.println("login success =" +expval);
			
		}
		else 
		{
		
			System.out.println("login failed");
		}
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.close();

	}

}

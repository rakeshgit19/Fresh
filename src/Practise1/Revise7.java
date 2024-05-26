package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise7 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//to login a application using chrome
		System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.navigate().to("https://www.facebook.com/");
		dr.manage().window().maximize();
		
		WebElement drop = dr.findElement(By.id("u_0_5"));
		boolean b = drop.isEnabled();
		System.out.println(b);
		
		if (drop.isEnabled()) 
		{
		Thread.sleep(5000);
			 drop.click();
			 System.out.println("click is success");
			
		}
		else 
		{
		
			System.out.println("click is unsuccess");
		}

	}

}

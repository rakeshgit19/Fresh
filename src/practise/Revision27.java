package practise;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Revision27 
{

	public static void main(String[] args) throws IOException 
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[2]/div[2]/p[3]/a")).click();
		Runtime.getRuntime().exec("C:\\Users\\RAKESH\\Desktop\\DOWNLOAD FILE.exe");

	}

}

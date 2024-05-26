package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise2 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
		ChromeDriver dr = new ChromeDriver();
		dr.navigate().to("http://primusbank.qedgetech.com/");
		dr.manage().window().maximize();
		dr.findElement(By.id("txtuId")).sendKeys("Admin");
		dr.findElement(By.id("txtPword")).sendKeys("Admin");
		dr.findElement(By.id("login")).sendKeys(Keys.ENTER);
		
		//get current url
		String  url = dr.getCurrentUrl();
		System.out.println("current url =" +url);
		System.out.println("lengt of the url ="+url.length());
		
		/*String source = dr.getPageSource();
		System.out.println("source page is =" +source);*/
		
		//get title of the page
		String title = dr.getTitle();
		System.out.println("title of the page is =" +title);
		System.out.println("length of the url is ="+title.length());
		
		String br = dr.findElement(By.className("xh-highlight")).getText();
		System.out.println("br is = "+br);
				
		
		

	}

}

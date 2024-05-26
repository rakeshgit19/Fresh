package practise;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Revision12 
{

	public static void main(String[] args) 
	{

 
		WebDriver driver;
	    driver = new ChromeDriver();
	    driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	    driver.manage().window().maximize();
	  String parent  = driver.getWindowHandle();
	  System.out.println("parent id ="+parent);
	    
	    
	    //click to flight window
	   driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	   //click to e-catering
	   driver.findElement(By.xpath("//span[contains(@class,'allcircle circlefour')]")).click();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	   //store collection of windows id
	   ArrayList<String>id = new ArrayList<String>(driver.getWindowHandles());
	   System.out.println("all window id is="+id);
	   
	   //switch to e catering window
	  String pagetitle = driver.switchTo().window(id.get(1)).getTitle();
	  System.out.println("pagetitle is="+pagetitle);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[contains(text(),'Your Orders')]")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  //switch to parent window
	  String parentid = driver.switchTo().window(id.get(0)).getTitle();
	  System.out.println("parent id is="+parentid);
	  driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("hwh");
	  
	  
	  
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
	    
		

	}

}

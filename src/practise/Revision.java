package practise;

import java.util.List;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Revision 
{

	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("WebDriver.chrome.driver","d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//launch url
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("page title is="+title);
		Thread.sleep(1000);
		System.out.println("page title length is="+title.length());
		Thread.sleep(1000);
		
		String url = driver.getCurrentUrl();
		System.out.println("page url is="+url);
		Thread.sleep(1000);
		System.out.println("url length is="+url.length());
		Thread.sleep(1000);
		
		/*String sourcecode = driver.getPageSource();
		Thread.sleep(1000);
		System.out.println("source code is"+sourcecode);
		Thread.sleep(1000);
		System.out.println("sourcecode length is"+sourcecode.length());
		Thread.sleep(1000);*/
		if (url.contains("https")) 
		{
		
			System.out.println("url is secure");
			
		}
		else
		{
		
			System.out.println("url is not secure");
		}
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Gmail")).click();
		Thread.sleep(1000);
		System.out.println("page title is = "+driver.getTitle());
		
		 	
		driver.navigate().back(); 
		//get collection of all links which are under html tag a in a page
		List<WebElement>obj = driver.findElements(By.tagName("a"));
		System.out.println("no of links are ="+obj.size());
		for (int i = 0; i <obj.size(); i++) 
		{
		
			//get link text
			String linkname = obj.get(i).getText();
			obj.get(i).click();
			String url1 = driver.getCurrentUrl();
			System.out.println(url1);
			Thread.sleep(2000);
			System.out.println(linkname+"\n"+url);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}

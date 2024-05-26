package practise;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision22 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//launch url in browser
		js.executeScript("return window.location = 'http://amazon.com'");
		
		//get title of the page
		String pagetitle = js.executeScript("return document.title").toString();
		System.out.println("pagetitle is ="+pagetitle);
		System.out.println("pagetitle length is ="+pagetitle.length());
		Thread.sleep(2000);
		
		//get current url of the page
		String url = js.executeScript("return document.URL").toString();
		System.out.println("url is="+url);
		System.out.println("url length is="+url.length());
		Thread.sleep(2000);
		
		//get domain nme
		String domain = js.executeScript("return document.domain").toString();
		System.out.println("domain name is ="+domain);
		System.out.println("domain length is ="+domain.length());
		
		
		

	}

}

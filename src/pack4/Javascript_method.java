package pack4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_method {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//create object for java script executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//launch url in browser
		js.executeScript("return window.location='https://amazon.com'");
		
		//get title of the page
		String pagetitle = js.executeScript("return document .title").toString();
		System.out.println("page title="+pagetitle);
		System.out.println("page title length="+pagetitle.length());
		
		//get current url of the page
		String url = js.executeScript("return document.URL").toString();
		System.out.println("url is="+url);
		System.out.println("url length is="+url.length());
		
		//get domain name
		String domain = js.executeScript("return document.domain").toString();
		System.out.println("domain name="+domain);
		System.out.println("domain length="+domain.length());
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}

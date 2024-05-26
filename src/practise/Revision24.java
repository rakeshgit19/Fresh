package practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision24 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//launch url in browser
		js.executeScript("return window.location = 'http://amazon.com'");
		
		//scroll from top to bottom in a webpage
		js.executeScript("window.scrollTo(0,document.body.ScrollHeight)");
		Thread.sleep(2000);
		
		//scroll from bottom to top
		js.executeScript("window.scrollTo(document.body.ScrollHeight,o)");

	}

}

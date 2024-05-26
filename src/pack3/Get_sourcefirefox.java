package pack3;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Get_sourcefirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		FirefoxDriver obj=new FirefoxDriver();
		
		//launching url in the browser
		obj.get("https://google.com");
		obj.manage().window().maximize();
		
		//get title of the page
		String pageTitle=obj.getTitle();
		System.out.println("page title is"+pageTitle);
		System.out.println("page title length is"+pageTitle.length());
		Thread.sleep(5000);
		
		//get current url of the page
		String strurl=obj.getCurrentUrl();
		System.out.println("current url is"+strurl);
		System.out.println("current url length is"+strurl.length());
		Thread.sleep(5000);
		
		//get source code of the page
		String strsource=obj.getPageSource();
		System.out.println("source code is"+strsource);
		System.out.println("source code length is"+strsource.length());
		Thread.sleep(5000);
		obj.close();

	}

}

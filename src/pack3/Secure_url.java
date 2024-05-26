package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Secure_url {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		//create an instance object for chromedriver
		ChromeDriver dr=new ChromeDriver();
		//launching url in the chrome river
		dr.get("http://facebook.com");
		//to maximize windows
		dr.manage().window().maximize();
		//to get complete URL
		String url=dr.getCurrentUrl();
		//now to verify wheather the URL is secure or not
		//and we knows that which URL contains "https://" is secure
		if (url.contains("https://"))
		{
			System.out.println("url is secure=" +dr.getCurrentUrl());
			
		}
		else {
			System.out.println("url is not secure=" +dr.getCurrentUrl());
		}
		Thread.sleep(3000);
		dr.close();
		
		
		
		
		
		
		
		
	}

}

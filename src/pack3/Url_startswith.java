package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Url_startswith {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		//create instnce object for chrome driver
		ChromeDriver dr=new ChromeDriver();
		//launch URL in chrome browser
		dr.get("https://vidyalakshmi.co.in");
		//get complete url
		String url=dr.getCurrentUrl();
		//verify that given URL is startswith "https://" or not
		if (url.startsWith("https://")) 
		{
			System.out.println("url startswith =" +"https://");
			System.out.println("url is =" + dr.getCurrentUrl());
			
		}
		else {
			System.out.println("url not startswith =" +"https://");
			System.out.println("url is =" + dr.getCurrentUrl());
		}
		
		Thread.sleep(4000);
		dr.close();
		
		
		
		
		
	}

}

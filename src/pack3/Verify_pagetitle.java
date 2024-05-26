package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_pagetitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		//create instance object for google chrome
		ChromeDriver dr=new ChromeDriver();
		
		//launch url in chrome browser
		dr.get("https://vidyalakshmi.co.in");
		
		//to maximize windows
		dr.manage().window().maximize();
		
		//to get pagetitle
		String pagetitle=dr.getTitle();
		
		//verify given title matches with the application title
		if (pagetitle.equalsIgnoreCase("vidyalakshmi")) 
		{
	
			System.out.println("given title matches with application title=" +pagetitle);
			
		}
		else {
			System.out.println("given title does not matches with application title=" +pagetitle);
			
		}
		Thread.sleep(3000);
		dr.close();
	}
	
	

}

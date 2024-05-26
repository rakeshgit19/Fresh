package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Url_verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		//create one instance object for chrome driver
		ChromeDriver dr=new ChromeDriver();
		//launching url in browser
		dr.get("http://google.com");
		dr.manage().window().maximize();
		//get complete url
		String url=dr.getCurrentUrl();
		//verify the given url contains https://
	if (url.contains("htts://")) 
	{
	System.out.println("current url contains="+"htts://");	
	}
	else 
	{
		System.out.println("current url does not contains="+"htts");
	}
	//if current url not contains htts then show me current url
	String strurl=dr.getCurrentUrl();
	System.out.println("current url is="+strurl);
	}

}

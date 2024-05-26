package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getTextmethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		//create instance object for google driver
		ChromeDriver dr=new ChromeDriver();
		//launching url in browser
		dr.get("https://vidyalakshmi.co.in");
		//to maximize windows
		dr.manage().window().maximize();
		
		String linkname="vidyalakshmi";
		
		//to take linkname
		String linknam=dr.findElement(By.partialLinkText("vidyalakshmi")).getText();
		
		//to verify the link name is available in the webpage or not
		if (linkname.contains("vidyalakshmi"))
		{
			System.out.println("link name is available in the webpage =" +linkname);
		}
		
		else {
			System.out.println("link name is not available in the webpage =" +linkname);
		}
		dr.close();
	}
	

}

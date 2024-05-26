package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class For_list {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		
		//create instance object for google driver
		ChromeDriver dr=new ChromeDriver();
		
		//launching url in browser
		dr.navigate().to("https://facebook.com");
		dr.manage().window().maximize();
		
		//get collection of all links which are under html tag"a" in a page
		List<WebElement>driver=dr.findElements(By.tagName("a"));
		System.out.println("no of links are =" +driver.size());
		
		for(int i=0; i< driver.size(); i++ )
		{
			//get link text
			String linkname=driver.get(i).getText();
			System.out.println(linkname);
			
			
			
			
		
		}
		
		
		
		
		
		
	}

}

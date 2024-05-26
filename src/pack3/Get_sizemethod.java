package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_sizemethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		//create instance object for google driver
		ChromeDriver dr=new ChromeDriver();
		
		//launching url in browser
		dr.get("https://facebook.com");
		
		//to maximize windows
		dr.manage().window().maximize();
		
		//store firstname into webelement
		WebElement firstname=dr.findElement(By.id("u_0_k"));
		Dimension dim=firstname.getSize();
		System.out.println("height=" +dim.getHeight() + "width=" +dim.getWidth());
		
		dr.close();

	}

}

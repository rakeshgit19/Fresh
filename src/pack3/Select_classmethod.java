package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_classmethod {

	public static void main(String[] args) throws InterruptedException {
		//write a script to verify the listbox is multiselection or single selection.select items in month listbox
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");

		//create instance object for google driver
		ChromeDriver dr=new ChromeDriver();
		
		//launching url in browser
		dr.navigate().to("https://facebook.com");
		dr.manage().window().maximize();
		
		//store month listbox into webelement
		WebElement omonth=dr.findElement(By.id("month"));
		
		//to access "select class methods" create object for month listbox using select method
		Select element=new Select(omonth);
		
		//verify listbox in single or multiple selection
		boolean value=element.isMultiple();
		System.out.println(value);
		
		element.selectByVisibleText("Mar");
		System.out.println(element.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		element.selectByIndex(10);
		System.out.println(element.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		dr.close();
		
		
		
		
		
		
	}

}

package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Revision4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// store listbox into webelement
		WebElement listbox = driver.findElement(By.id("searchDropdownBox"));
		Select listbox1 = new Select(listbox);
		listbox1.selectByVisibleText("Baby");
		Thread.sleep(2000);
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		
		//get no of items in  listbox
		List<WebElement>olist =listbox1.getOptions();
		System.out.println("no of list are = "+olist.size());

	}

}

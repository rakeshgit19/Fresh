package pack3;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class X_path {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		FirefoxDriver dr = new FirefoxDriver();
		
		//launch url in browser
		dr.get("https://facebook.com");
		dr.manage().window().maximize();
	
		//find elements and input values for textboxes by using x-path	
		dr.findElement(By.xpath("//*[@name='firstname']")).sendKeys("rajesh");
		dr.findElement(By.xpath("//*[@name='firstname']//following::input[1]")).sendKeys("kumar");
		dr.findElement(By.xpath("//*[@name='firstname']//following::input[2]")).sendKeys("rakesh@gmail.com");
		dr.findElement(By.xpath("//*[@name='firstname']//following::input[3]")).sendKeys("rakesh@gmail.com");
		dr.findElement(By.xpath("//*[@name='firstname']//following::input[5]")).sendKeys("rakeshkumar");

		
		//write script for birthday(day) and give your value .create one object for "day" and write select method
		//for selecting and put value
		Select day = new Select(dr.findElement(By.xpath("//select[@title ='Day']")));
		day.selectByIndex(5);
		

		//verify listbox is single or multiple selection
		boolean value = day.isMultiple();
		System.out.println(value);
		
		
		//write script for birthday(month) and give your value .create one object for "month" and write select method
		//for selecting and put value
		Select month = new Select(dr.findElement(By.xpath("//select[@title ='Day']//following::select[1]")));
		month.selectByIndex(5);
		
		//write script for birthday(year) and give your value .create one object for "year" and write select method
		//for selecting and put value
		Select year = new Select(dr.findElement(By.xpath("//select[@title ='Day']//following::select[2]")));
		year.selectByIndex(5);
		
		//write code for clicking 'male button'
		dr.findElement(By.xpath("//input[@value='2']")).click();
		
		
		//write code for clicking 'signup button'
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		
		
		
		
		
		Thread.sleep(3000);
		
		dr.close();
		
		
		
		

	}

}

package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_facebookpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		//creating instance object for browser class
		ChromeDriver dr=new ChromeDriver();
		
		//launch url in browser
		dr.get("http://facebook.com");
		dr.manage().window().maximize();
		
		//writing code for firstname and give your name
		dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rajesh");
		
		//writing code for surname and give your name
		dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumarr");
		
		//write code for mobile no or email address and give your no or email
		dr.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7980266740");
		
		//write code for new password and give your password
		dr.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rakeshkumar");
		
		
		//write code for birthday(day) and give your value .create one object for "day" and write select method
		//for selecting and put value
		Select element1 = new Select(dr.findElement(By.xpath("//select[@title='Day']")));
		element1.selectByIndex(28);
		
		//verify listbox is single or multiple selection
		boolean value = element1.isMultiple();
		System.out.println(value);
		
		
		//write code for birthday(month) and give your value .create one object for "month" and write select method
		//for selecting and put value
		Select element2 = new Select(dr.findElement(By.xpath("//select[@title='Month']")));
		element2.selectByIndex(6);
		
		
		//write code for birthday(year) and give your value .create one object for "year" and write select method
		//for selecting and put value
		Select element3 = new Select(dr.findElement(By.xpath("//select[@title='Year']")));
		element3.selectByIndex(10);
		
		//write code for clicking 'male button'
		dr.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		
		
		//write code for clicking 'signup button'
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(3000);
		dr.close();	
		
		
		
		
	}

}

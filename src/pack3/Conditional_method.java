package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Conditional_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
		
	//store firstname testbox and verify is it enabled or not
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Boolean is_enable = firstname.isEnabled();
		Boolean is_displayed = firstname.isDisplayed();
		System.out.println(is_displayed);
		System.out.println(is_enable);
		
	//store reenter mobile textbox & verify it is displayed or not
		WebElement reenter = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		Boolean is_displayed1 = reenter.isDisplayed();
		System.out.println(is_displayed1);
		
	//enter some text in reenter mailbox
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ritamita@gmail.com");
		reenter.sendKeys("ritamita@gmail.com");
		Boolean after_displayed = reenter.isDisplayed();
		System.out.println(after_displayed);
	
		
	}

}

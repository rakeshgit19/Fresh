package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.manage().window().maximize();
	
		
		//for email
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		boolean is_enabled = email.isEnabled();
		System.out.println(is_enabled);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("man@gmail.com");
	 
		
		//for re-email
		WebElement reemail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean is_enable = reemail.isEnabled();
		boolean is_dis = reemail.isDisplayed();
		System.out.println(is_enable);
		System.out.println(is_dis);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("man@gmail.com");
        Thread.sleep(3000);
        
        
        //store male radiobutton and verify male radiobutton is selected or not
        WebElement maleradiobutton = driver.findElement(By.xpath("//input[@value='2']"));
        boolean is_selected = maleradiobutton.isSelected();
        System.out.println(is_selected);
        
        //if male radiobutton is not selected then select it
       // driver.findElement(By.xpath("//input[@value='2']")).click();
        if(!maleradiobutton.isSelected())
        	//select male radiobutton
        	maleradiobutton.click();
        driver.close();
	}

}

package practise;

import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision8
{

	public static void main(String[] args) throws InterruptedException 
	{
		/*write a script to handle alert for primus bank.
		launch primus bank application in chrome browser.
		click on login without giving username and Password.__OBFUSCATE
		get the alert text
		enter valid username and invalid password
		get the alert message and dismiss*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		//clik on login button without filling username and password
		driver.findElement(By.xpath("//*[name='login']")).click();
		
		//get alert text
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		
		//accept the alert
		driver.switchTo().alert().accept();
		
		//fill login page
		driver.findElement(By.xpath("//*[@name='txtuid']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtpword']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		//get alert text
		String alert1 = driver.switchTo().alert().getText();
		System.out.println(alert1);
		Thread.sleep(2000);
		//dismiss the alert
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
		
		

	}

}

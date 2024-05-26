package practise;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Revision28 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Qedge123!@#");
		driver.findElement(By.xpath("//input[@name='Submit']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnAdd']")).click();
		driver.findElement(By.id("firstName")).sendKeys("rite");
		driver.findElement(By.id("lastName")).sendKeys("mita");
		driver.findElement(By.id("employeeId")).sendKeys("123");
		driver.findElement(By.id("photofile")).click();
		
		//here i have to give Autoit script
		Runtime.getRuntime().exec("C:\\Users\\RAKESH\\Desktop\\UPLOADFILE.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		
		
		
		
		
		

	}

}

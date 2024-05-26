package pack4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadingfile_usingAutoit {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		dr.manage().window().maximize();
		
		//select username
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		dr.findElement(By.id("btnLogin")).click();
		dr.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("firstName")).sendKeys("Rakesh");
		dr.findElement(By.id("middleName")).sendKeys("Kumar");
		dr.findElement(By.id("lastName")).sendKeys("Dalai");
		dr.findElement(By.id("employeeId")).sendKeys("45678");
		dr.findElement(By.xpath("//*[@id=\"photofile\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);		
		//here i have to give Autoit script
		Runtime.getRuntime().exec("C:\\Users\\RAKESH\\Desktop\\uploadpc.exe");
		Thread.sleep(7000);
		dr.findElement(By.id("btnSave")).click();
		
		

	}

}

package practise;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision15 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		//write a script to handle windows , frames , alert
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("parent id is ="+parent);
		ArrayList<String>winids = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("winid is =" +winids);
		//driver.switchTo().alert().accept();
		//driver.switchTo().window(winids.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Account Balance')]")).click();
		
		

	}

}

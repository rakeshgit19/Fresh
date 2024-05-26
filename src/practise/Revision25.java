package practise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision25 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("return window.location ='http://orangeHRM.qedgetech.com'");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//select the element
		js.executeScript("document.querySelector('#txtUsername').value='Admin'");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('#txtPassword').value='Admin'");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('#btnLogin').click()");
		
		String msg = js.executeScript("return document.URL").toString();
		System.out.println("msg is ="+msg);
		if (msg.contains("dsh")) 
		{
			System.out.println("login success");
		}
		else 
		{
		
			System.out.println("login unsuccess");
		}
		String errormsg =js.executeScript("return document.getElementById('spanMessage').innerHTML").toString();
		System.out.println("login unsuccess ="+errormsg);

	}

}

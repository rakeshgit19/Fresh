package pack4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locateelement_usingjavascript {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dr = new ChromeDriver();
		
		//create object for java script executor
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		//launch url in browser
		js.executeScript("return window.location='http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
		Thread.sleep(1000);
		
		//find username and insert value
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		Thread.sleep(1000);
		
		//find password and insert value
		js.executeScript("document.getElementById('txtPassword').value='test'");
		Thread.sleep(1000);
		
		//find login button and press click
		js.executeScript("document.getElementById('btnLogin').click()");
		
		String url = js.executeScript("return document.URL").toString();
		System.out.println("url is="+url);
		Thread.sleep(1000);
		if (url.contains("dash"))
		
		{
		
			System.out.println("login success");
		}
		else {
			System.out.println("login unsuccess");
		}
		//get error message
		String message = js.executeScript("return document.getElementById('spanMessage').innerHTML").toString();
		System.out.println("error message ="+message);
		Thread.sleep(1000);
		dr.close();
				
		
		
		
		

	}

}

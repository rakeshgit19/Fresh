package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Using_navigatemethod {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
   ChromeDriver dr = new ChromeDriver();
		
		
		//launching url in browser
		dr.navigate().to("https://facebook.com");
		



		//to maximize windows
		dr.manage().window().maximize();
		System.out.println("page title [1] =" + dr.getTitle());
		Thread.sleep(3000);
		
		//click on login button
		dr.findElement(By.partialLinkText("Log In")).click();
		System.out.println("page title [2] =" + dr.getTitle());
		Thread.sleep(3000);
		
		//click on back button
		dr.navigate().back();
		System.out.println("page title [3] =" + dr.getTitle());
		Thread.sleep(3000);
		
		//click on forward button
		dr.navigate().forward();
		System.out.println("page title [4] =" + dr.getTitle());
		Thread.sleep(3000);
		
		//click on refresh button
		dr.navigate().forward();
		System.out.println("page title [5] =" + dr.getTitle());
		Thread.sleep(3000);
		
		dr.close();
		
		
	}
	

}

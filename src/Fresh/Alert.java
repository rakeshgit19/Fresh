package Fresh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		dr.findElement(By.id("login")).click();
		//get text message of alert window
		String alert = dr.switchTo().alert().getText();
		System.out.println(alert);
		//accept the alert
		dr.switchTo().alert().accept();
		dr.switchTo().window("");
		//to return to parent frame
		dr.switchTo().parentFrame();
		//to return main window
		dr.switchTo().defaultContent();
		//to switch to any frame
		dr.switchTo().frame("");
		//to get unique id of a single window
		String s = dr.getWindowHandle();
		//to get unique id of all windows. Here we are taking SET as it doesnot contain any duplicate id
		Set<String> wind = dr.getWindowHandles();
		

	}

}

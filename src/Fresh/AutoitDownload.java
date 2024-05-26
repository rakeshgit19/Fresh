package Fresh;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoitDownload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		dr.manage().window().maximize();
		//http://orangehrm.qedgetech.com/
		//Admin , Qedge123!@#
		Thread.sleep(5000);
		//here we are identifying java logo and then clicking on it logo
		dr.findElement(By.xpath("//body/div[1]/main[1]/div[3]/div[3]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\CHANDAN\\Desktop\\Script for Downloadfile.exe");

	}

}

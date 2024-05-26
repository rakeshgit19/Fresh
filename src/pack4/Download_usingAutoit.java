package pack4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Download_usingAutoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		FirefoxDriver dr = new FirefoxDriver();
		dr.get("https://www.seleniumhq.org/download/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//div[2]/div[2]/p[3]/a")).click();
		Runtime.getRuntime().exec("C:\\Users\\RAKESH\\Desktop\\DOWNLOAD FILE2.exe");
		Thread.sleep(5000);
		
		
		
	}

}

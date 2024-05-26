package pack4;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage_usingjavascript {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dr = new ChromeDriver();
		

		//create object for java script executor
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		//launch url in browser
		js.executeScript("return window.location='https://www.w3schools.com/sql/sql_select.asp'");
		
		//scroll from top to bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//scroll from bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		
		//scroll vertically upto certain pixel
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		dr.close();
		
		
		

	}

}

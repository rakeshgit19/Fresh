package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) {
		//Here if you add the Chrome.exe file to your project then no need to write system.setProperty 
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	    driver.get("http://facebook.com");
		driver.close();
		//driver.quit();
		;;
		
		
		;;;
		
	}

}

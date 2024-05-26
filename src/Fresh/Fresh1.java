package Fresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fresh1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000 );
		driver.get("http://facebook.com");
		Thread.sleep(2000 );
		//driver.findElement(By.xpath("//*[text()=Create new account]")).click();;
		////*[contains(text(),'open-registration-form-button')]
		driver.findElement(By.xpath("//*[@id='email']//following::input[3]")).click();;

	}

}

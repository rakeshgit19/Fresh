package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingalert_methods {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();

//launching primusbank application in firefox browser
driver.navigate().to("http://primusbank.qedgetech.com/");

//click on login without giving username and password
driver.findElement(By.xpath("//input[@id='login']")).click();

//get the alert text
String alerttext = driver.switchTo().alert().getText();
System.out.println(alerttext);
Thread.sleep(5000);

//accept the alert
driver.switchTo().alert().accept();

//Enter valid username and invalid password
driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@id='txtuId']//following::input[1]")).sendKeys("adminn123");
driver.findElement(By.xpath("//input[@id='login']")).click();

//get the alert message and dismiss
String alerttext1 = driver.switchTo().alert().getText();
System.out.println(alerttext1);
Thread.sleep(4000);

//dismiss the alert
driver.switchTo().alert().dismiss();

//Thread.sleep(5000);
//driver.quit();

















	}

}

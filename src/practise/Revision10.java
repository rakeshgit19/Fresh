package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision10 
{

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Framework_Rakesh/dropdown.html");
		driver.manage().window().maximize();

	}

}

package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Framework_Rakesh/checkbox_1.html");
		driver.manage().window().maximize();
		
		
		
	}

}


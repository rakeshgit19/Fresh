package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision14 
{

	public static void main(String[] args) throws InterruptedException 
	{


		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://paytm.com/recharge");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='_26Vr']")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//get collection of frames
		List<WebElement>olist = driver.findElements(By.tagName("iframe"));
		System.out.println("name of frames are ="+olist);
		
		//switch to frame
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[2]/a")).click();
		Thread.sleep(3000);
		//driver.close();
		//switch to window

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='FgQ9 _1YYJ _3H6b']//li[2]//a[1]//img[1]")).click();
		
		
		
		

	}

}

package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MMT 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//click FROM button
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']//p[@class='font14 appendBottom5 blackText'][contains(text(),'Delhi, India')]")).click();
		//click TO button
		driver.findElement(By.xpath("//span[contains(text(),'To')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]")).click();
		//click calender
		driver.findElement(By.xpath("//div[contains(@class,'fsw_inputBox dates inactiveWidget')]")).click();
		Thread.sleep(1000);
		List<WebElement>calender1 = driver.findElements(By.xpath("//div[contains(@class,'datePickerContainer')]"));
        int s = calender1.size();
		
		for (int i = 0; i < s; i++) 
		{
			try
			{
			  
			  String date = calender1.get(i).getText();
			  if (date.equalsIgnoreCase("10")) 
			  {
			
				calender1.get(i).click();
				
			  }
			}
			catch (Exception e) 
			{
				//System.out.println(e.getMessage());
			}
		}
		
		 Thread.sleep(1000);
	}

}

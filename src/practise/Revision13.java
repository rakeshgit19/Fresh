package practise;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision13 
{

	public static void main(String[] args) 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println("parent id is="+parent);
		
		//get collection of windows
		ArrayList<String>winid = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("windows id is="+winid);
		
		//switch to advertisement window
		String pagetitle = driver.switchTo().window(winid.get(1)).getTitle();
		System.out.println("pagetitle is="+pagetitle);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		
		//switch to another advertisement window
		String pagetitle1 = driver.switchTo().window(winid.get(2)).getTitle();
		System.out.println("pagettitle1 is ="+pagetitle1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		
		//switch to another advertisement window
		String pagetitle2 = driver.switchTo().window(winid.get(3)).getTitle();
		System.out.println("pagetitle2 is ="+pagetitle2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		
		//switch to parent window
		String parent1 = driver.switchTo().window(winid.get(0)).getTitle();
		System.out.println("parenttitle is ="+parent1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//click on register with us search
		driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		

	}

}

package pack3;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specificwindow_usingarraylist {

	public static void main(String[] args) throws InterruptedException {
   ChromeDriver driver = new ChromeDriver();
   driver.navigate().to("https://gmail.com");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   String parent = driver.getWindowHandle();
   System.out.println("parent id =" +parent);
   
   //click on help link
   driver.findElement(By.xpath("//ul/li[1]/a")).click();
   Thread.sleep(1000);
   
   //click on privacy link
   driver.findElement(By.xpath("//ul/li[2]/a")).click();
   Thread.sleep(1000);
   
   //click on terms link
   driver.findElement(By.xpath("//ul/li[3]/a")).click();
   Thread.sleep(1000);
   
   //print all windows id
   ArrayList<String>br = new ArrayList<String>(driver.getWindowHandles());
   System.out.println("print all windows id=" +br);
   
   //switch to privacy window
   String pagetitle = driver.switchTo().window(br.get(2)).getTitle();
   System.out.println("privacy title =" +pagetitle);
   Thread.sleep(1000);
   driver.close();
   
   //switch to help window
   String pagetitle1 = driver.switchTo().window(br.get(1)).getTitle();
   System.out.println("privacy title =" +pagetitle1);
   Thread.sleep(1000);
   driver.close();
   
   //switch to terms window
   String pagetitle2 = driver.switchTo().window(br.get(3)).getTitle();
   System.out.println("privacy title =" +pagetitle2);
   Thread.sleep(1000);
   driver.close();
   
   //switch to current window
   String parenttitle = driver.switchTo().window(br.get(0)).getTitle();
   System.out.println("parenttitle ="+parenttitle);
   
   //input some value in username and password and click login
   driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("pranga2010");
   driver.findElement(By.xpath("//div[2]/div/div[1]/div/content")).click();
   driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("pranga2010");
   Thread.sleep(1000);
   driver.close();
   
   
   
   
   
   
   


	}

}

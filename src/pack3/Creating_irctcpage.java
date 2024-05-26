package pack3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creating_irctcpage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("parent ="+parent);
				
		
		
		//click flight link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[1]/a/span")).click();
		Thread.sleep(2000);
		
		
		//click stay link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[2]/a/span")).click();
		Thread.sleep(2000);

		
		//click e-catering link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
		
		//click holiday packages link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
		
		//click tourist train link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[5]/a/span")).click();
		Thread.sleep(2000);
		
		//click hill railways link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[6]/a/span")).click();
		Thread.sleep(2000);
		
		//click on charter train link
		driver.findElement(By.xpath("//div[2]/div/app-main-page/div[10]/div/ul/li[7]/a/span")).click();
		Thread.sleep(3000);
		
		//click on gallery link
		//driver.findElement(By.xpath(" //span[@class='allcircle circlenine']")).click();
		//Thread.sleep(3000);
		//driver.quit();
		
		ArrayList<String>allwins = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("allwins id ="+allwins);
		
		//switch to flight link and print page title
		String pagetitle = driver.switchTo().window(allwins.get(3)).getTitle();
		System.out.println("pagetitle = "+pagetitle);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul/li[1]/asearch/input")).sendKeys("kolkata");
		Thread.sleep(2000);
		
		//for selecting dropdown we have to create one object
		Select element1 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		element1.selectByVisibleText("International");
		driver.findElement(By.xpath("//div[1]/div/form/ul/li[3]/input")).click();
		Thread.sleep(3000);
		
		//click back button to come to default page
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
		
		//switch to flight link and print page title
		String pagetitle1 = driver.switchTo().window(allwins.get(2)).getTitle();
		System.out.println("pagetitle1 =" +pagetitle1);
		Thread.sleep(3000);
		driver.close();
		
		//switch to flight link and print page title
		String pagetitle2 = driver.switchTo().window(allwins.get(1)).getTitle();
		System.out.println("pagetitle2 ="+pagetitle2);
		Thread.sleep(3000);
		driver.close();
		
		//switch to flight link and print page title
		String pagetitle3 = driver.switchTo().window(allwins.get(4)).getTitle();
	    System.out.println("pagetitle3 ="+pagetitle3);
	    Thread.sleep(3000);
		driver.close();
				
		//switch to flight link and print page title
		String pagetitle4 = driver.switchTo().window(allwins.get(5)).getTitle();
		System.out.println("pagetitle4 ="+pagetitle4);
		Thread.sleep(3000);
		driver.close();
				
		//switch to flight link and print page title
		String pagetitle5 = driver.switchTo().window(allwins.get(6)).getTitle();
		System.out.println("pagetitle5 ="+pagetitle5);
		Thread.sleep(3000);
		driver.close();
				
		//switch to flight link and print page title
		String pagetitle6 = driver.switchTo().window(allwins.get(7)).getTitle();
		System.out.println("pagetitle6 ="+pagetitle6);
		Thread.sleep(3000);
		driver.close();
	    
	    //switch to parent window link and print page title
	    String parent1 = driver.switchTo().window(allwins.get(0)).getTitle();
	    System.out.println("parent1 ="+parent1);
	    driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("HYDERABAD DECAN - HYB");
	    driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("HOWRAH JN - HWH");
	    //driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']")).click();
	    //driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
	    
	    //Select allclass = new Select(driver.findElement(By.xpath("//label[@class='ng-tns-c13-7 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")));
	    //allclass.selectByVisibleText("Anubhuti Class (EA)");
	    
	    //click checkbox
	    driver.findElement(By.xpath("//label[contains(text(),'Flexible With Date')]")).click();
	    
	    //click on find trains
	    driver.findElement(By.xpath("//button[contains(text(),'Find trains')]")).click();
	     
	    Thread.sleep(3000);
	    //driver.close();
	    
	    //click on trains
	    driver.findElement(By.xpath("//div[2]/div[2]/div[2]/nav/ul/li[3]/a")).click();
	    
	    
	  	    
	    
				
		
		
		

		
		
		
		
		
	}

}

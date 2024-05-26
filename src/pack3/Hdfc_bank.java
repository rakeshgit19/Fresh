package pack3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc_bank {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
	String url = "https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking";
    ChromeDriver driver = new ChromeDriver();
    driver.get(url);
    driver.manage().window().maximize();
    
    //get parent window id
    String parent = driver.getWindowHandle();
    System.out.println(parent);
    
    //click on login button
    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/div[2]/div/div[1]")).click();

    //verify the netbanking radiobutton is selected or not.if not selected then select it
    WebElement netbankingradio = driver.findElement(By.id("netbanking"));
    if(!netbankingradio.isSelected())
    	Thread.sleep(2000);
    	netbankingradio.click();
    Thread.sleep(2000);

    //click on login button after selecting netbanking radiobutton
    driver.findElement(By.id("loginsubmit")).click();
    
    //get collection of all windows id
    Set<String>allwins = driver.getWindowHandles();
    System.out.println(allwins);
    for (String each : allwins) 
    	
    	//parent window should not equal to child window
    	if (!parent.equals(each))
    	{
			
    		driver.switchTo().window(each);
    		driver.manage().window().maximize();
    		driver.findElement(By.partialLinkText("CONTINUE")).click();
    		Thread.sleep(2000);
		
	}
     
    //switch to frame
    driver.switchTo().frame(0);
    Thread.sleep(2000);
    
    //click on continue
    driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
    Thread.sleep(2000);
    
    //get alert message
    String alerttext = driver.switchTo().alert().getText();
    System.out.println(alerttext);
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss();
    Thread.sleep(2000);
    driver.quit();
		
		
		
		
		
		

	}

}

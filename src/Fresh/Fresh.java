package Fresh;

import java.util.Iterator;
import java.util.List;

import org.apache.bcel.verifier.exc.LinkingConstraintException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://primusbank.qedgetech.com/");
		Thread.sleep(2000);
		//dr.manage().window().maximize();
		//dr.close();
		//username= Admin
		//password= Admin	
		
		//applying select class in the dropdown
	//	WebElement drop = dr.findElement(By.id("drlist"));
		Select s = new Select(dr.findElement(By.id("drlist")));
		List<WebElement> l = s.getOptions();
		System.out.println("all items are = "+l);
		System.out.println("no of items are = "+l.size());
		
		for (int i = 1; i < l.size(); i++) {
			String itemname = l.get(i).getText();
			System.out.println("All item names are = " +itemname);
		}
		
		Boolean b = s.isMultiple();
		System.out.println(b);
		//s.selectByVisibleText("Moosapet");
		s.selectByIndex(2);
		System.out.println(s.getAllSelectedOptions());
		Thread.sleep(2000);	
		//s.deselectByIndex(2);
		
		dr.findElement(By.id("txtuId")).sendKeys("Admin");
		
		//To get dimension first we need to store that in webelement
				WebElement H = dr.findElement(By.id("txtuId"));
				Dimension dim = H.getSize();
				System.out.println("dimension is"+dim.getHeight());
				System.out.println("dimension is"+dim.getWidth());
	Thread.sleep(2000);			
		
		dr.findElement(By.id("txtPword")).sendKeys("Admin");
		dr.findElement(By.id("login")).click();
		
		
		
		//get page title of the url
		String title = dr.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		//get current url
		String currenturl = dr.getCurrentUrl();
		System.out.println(currenturl);
		//get pagesource of the url
		String pagesource = dr.getPageSource();
		System.out.println(pagesource);
		
		if (title.equals(currenturl)) {
			System.out.println("true");
		} else {
System.out.println("false");
		}
		if (title.startsWith("Primus")) {
			System.out.println("true");
		} else {
System.out.println("false");
		}
		if (title.endsWith("Primus")) {
			System.out.println("true");
		} else {
System.out.println("false");
		}
		if (title.contains("Primus")) {
			System.out.println("true");
		} else {
System.out.println("false");
		}
		Thread.sleep(2000);
		String test1= "Bank";
		String test2=dr.findElement(By.xpath("//*[contains(text(),'Roles')]")).getText(); 
		System.out.println(test2);
		if (test1.contains(test2)) {
			System.out.println("true");
		} else {
System.out.println("false");
		}
		//store all the html link tagged with anchor tag a
		List<WebElement> linklist = dr.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		//get all the link name
		for (int i = 0; i < linklist.size(); i++) {
			String linkname = linklist.get(i).getText();
			System.out.println(linkname);
			//linklist.get(i).click();
			//String getcurl = dr.getCurrentUrl();
		}
		
		String getcurl = dr.getCurrentUrl();
		System.out.println(getcurl);
		if (getcurl.contains("http")) {
System.out.println("its secure");			
		} else {
			System.out.println("its not secure");
		}

		
	}

}

package pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/Framework_Rakesh/checkbox_1.html");
		driver.manage().window().maximize();
		
	//get collection of checkbox radiobutton which are under html input tag
		List<WebElement>checklistbox = driver.findElements(By.tagName("input"));
		System.out.println("no of checkbox =" +checklistbox.size());
		
	//print the names of checkbox radiobutton
		for (int i = 0; i < checklistbox.size(); i++) 
		{
			String checklistboxname = checklistbox.get(i).getAttribute("value");
			System.out.println(checklistboxname);
		
		
	//unselect the checkbox which is already selected and select which is not selected
		if (!checklistbox.get(i).isSelected())
		{
			//select checkbox which are not selected
			checklistbox.get(i).click();
		}
			else {
				//unselect checkbox which is already selected
				checklistbox.get(i).click();;
			}
		Thread.sleep(3000);
		driver.close();
		}
		
	}}


package pack4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyloginfunctionality_withmultipledata {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileReader fr = new FileReader("D:\\verify orangehrm password.txt");
		BufferedReader br = new BufferedReader(fr);
		String login = "";
		while ((login = br.readLine())!=null) 
		{
		
//here we have to split that line which we have written in our notepad.so for splitting we have to write one code
			String str[] = login.split(";");
			
		//here launching driver for no of purpose to verify login data
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://orangehrm.qedgetech.com");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(str[0]);
			driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(str[1]);
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).sendKeys(Keys.ENTER);
			if (driver.getCurrentUrl().contains("dash")) 
			{
				
				System.out.println("login success");
				
			}
			else {
				String message = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).getText();
				System.out.println("login unsuccess ="+message);
			}
			Thread.sleep(5000);
			driver.close();
			
		}
		br.close();
		
		
		
		

	}

}

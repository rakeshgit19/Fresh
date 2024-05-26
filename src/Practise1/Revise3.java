package Practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revise3 
{

	public static void main(String[] args) 
	{
		        //to login a application using chrome
				System.setProperty("webdriver.chrome.drive","d://chromedriver.exe");
				ChromeDriver dr = new ChromeDriver();
				dr.navigate().to("https://www.facebook.com/");
				dr.manage().window().maximize();
				
				String name = dr.findElement(By.id("u_0_p")).getText();
				System.out.println("name is ="+name);
				
				WebElement name1 = dr.findElement(By.id("u_0_p"));
				
				Dimension dim = name1.getSize();
				System.out.println("dim size is =" +dim);
				
				int height =  dim.getHeight();
				System.out.println("height is =" + height);
				int width = dim.getWidth();
				System.out.println("width is =" +width);
				
				

	}

}

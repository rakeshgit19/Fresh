package practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Revision29 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{


		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		//for writing we create physical memory named as Rakesh1 as below
		File f = new File("C:\\Users\\RAKESH\\Desktop\\Rakesh1.txt");
		
		//for writing in physical memory we have to create a new file
		f.createNewFile();
		
		//for writing in that physical memory we wrote below code
		FileWriter fw = new FileWriter(f);
		
		//but for writing in that physical memory we have to allocate some space
		BufferedWriter bw = new BufferedWriter(fw);
		
		//now get the text from website which you want to write in your created file
		String text = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[1]")).getText();
		String text1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[2]")).getText();
		
		//now write the above text in your allocated memory
		bw.write(text);
		bw.newLine();
		Thread.sleep(1000);
	    bw.write(text1);
	    bw.flush();
	    bw.close();
		
		
		
		
		

	}

}

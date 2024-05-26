package practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision32 
{

	public static void main(String[] args) throws IOException 
	{

ChromeDriver driver = new ChromeDriver();
driver.get("https://www.seleniumhq.org/");
		File f = new File("C:\\Users\\RAKESH\\Desktop\\Mama1.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String t1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[1]")).getText();
		bw.write(t1);
		bw.newLine();
		bw.write("i want to marry");
		bw.flush();
		bw.close();
		
		

	}

}

package pack4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Writeatext_intoafilefromwebpage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		//first we will create one file in D drive
		File f = new File("D://RakeshSelenium.txt");
		f.createNewFile();
		
		//for writing something in file 'f' we have to create one physical memory
		FileWriter fw = new FileWriter(f);
		
//here we have to allocate or create one buffered memory in physical memory to allocating space for write
		BufferedWriter bw = new BufferedWriter(fw);
		
		//first store that text and get the text which you want to print
		String paragraph1 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[1]")).getText();
		String paragraph2 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/p[2]")).getText();
		
		//now write that text in buffered memory
		bw.write(paragraph1);
		//come to next line
		bw.newLine();
		bw.write(paragraph2);
		bw.newLine();
		
		//after writing give flush for release of memory
		bw.flush();
		
		//now close the writer
		bw.close();
		
		
		
		
		
		
		
		
		

	}

}

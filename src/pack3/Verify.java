package pack3;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		//create one instance object for chrome driver
		ChromeDriver dr=new ChromeDriver();
		//launching url in browser
		dr.get("http://google.com");
		dr.manage().window().maximize();
		String pagetitle=dr.getTitle();
		//verify wheather page contains with the given title
		if (pagetitle.equalsIgnoreCase("Google"))
		{
          System.out.println("page title is matching=" +pagetitle);		
		}
		else 
		{
			System.out.println("page tilte is not matching="+pagetitle);
		}
	dr.close();
	}

}

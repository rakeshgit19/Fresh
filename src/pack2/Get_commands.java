package pack2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_commands {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	//creating instance object for browser class
	ChromeDriver obj=new ChromeDriver();
	obj.get("http://gmail.com");
	obj.manage().window().maximize();
	
	// get url of the page
	String strpageUrl=obj.getCurrentUrl();
	System.out.println("current url is"+strpageUrl);
	System.out.println("length of current url"+strpageUrl.length());
	
	// get title of the page
	String strpageTitle=obj.getTitle();
	System.out.println("curret page title::"+strpageTitle);
	System.out.println("length of current page title"+strpageTitle.length());
	obj.close();
	
	
	}

}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public static void OpenBrowser()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Vishnu vardhan\\jarfiles\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://cubicitsolution.co.in/bookstore");
	
	}

}

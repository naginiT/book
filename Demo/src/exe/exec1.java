package exe;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import module.selct;
import page.BaseClass;
import page.home;
import utility.excelutility;
import utility.utilities;

public class exec1 {
	
	
	public WebDriver driver;
	@BeforeMethod
	 public void sub() throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
		BaseClass.OpenBrowser();
		excelutility.setExcelFile("C://Users//NSSS KKISHORE//Desktop//Book1.xlsx", "Sheet1");
		System.out.println("hello");
		System.out.println("hiiii");
		
		
	}
	
	
	@Test

	 public void main() throws Exception {
		
	
		selct.productType();
		System.out.println("complete");
		
		
		
	}
	
	@AfterMethod
	 public void close() throws Exception {
		
		
		selct.productType();
		//completed
		
		
		
	}
	

}

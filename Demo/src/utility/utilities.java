package utility;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page.BaseClass;

public class utilities {
		

	
	
	
	 public static void mouseHoverAction(WebElement mainElement, WebElement subElement,String subsubElement) throws Exception{
		
		 Actions action = new Actions(BaseClass.driver);
         action.moveToElement(mainElement).perform();
         Thread.sleep(4000);
         action.moveToElement(subElement).perform();
         
         if(subsubElement.equals("AGRICULTURAL PRODUCTS")){
        	 action.moveToElement(BaseClass.driver.findElement(By.xpath("//*[@id='bs-megamenu]/ul/li[2]/div/div/div/div/div/ul/li[1]/div/div/div/div/div/ul/li[1]/a/span")));
        	// Log.info("Accessories link is found under Product Category");
        	 System.out.println("Accessories link is found under Product Category");
        	 
        	 
        
         }
         if(subsubElement.equals("SNACK AND SWEET")){
        	 action.moveToElement(BaseClass.driver.findElement(By.xpath("//*[@id='bs-megamenu']/ul/li[2]/div/div/div/div/div/ul/li[2]/div/div/div/div/div/ul/li[3]/a/span")));
        	 //Log.info("iMacs link is found under Product Category");
        	 
         }
       /*  if(subElement.equals("iPads")){
        	 action.moveToElement(driver.findElement(By.linkText("iPads")));
        	// Log.info("iPads link is found under Product Category");
         }
         if(subElement.equals("iPhones")){
        	 action.moveToElement(driver.findElement(By.linkText("iPhones")));
        	// Log.info("iPhones link is found under Product Category");
         }*/
        action.click();
        Thread.sleep(4000);
         action.perform();
         
         
        // Log.info("Click action is performed on the selected Product Type");
	 }
	 /*public static void waitForElement(WebElement element){
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
	     wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}*/
	 
	 
	 
		
	 
	 
	 public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{
			try{
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//	FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName +".jpg"));	
			} catch (Exception e){
				//Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());
				throw new Exception();
			}
		}
	 
	 
	}

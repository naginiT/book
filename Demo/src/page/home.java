package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.utilities;

public class home extends BaseClass{
	
	
	
	
        private static WebElement element = null;
       
    public home(WebDriver driver){
        	super();
    }    
    public static WebElement lnk_MyAccount() throws Exception{
        try{ 
        	 element = driver.findElement(By.xpath(".//*[@id='account']/a"));
            // Log.info("My Account link is found on the Home Page");
             
        }catch (Exception e){
       		//Log.error("My Acocunt link is not found on the Home Page");
       		throw(e);
       		}
       	return element;
    }
    public static WebElement lnk_LogOut() throws Exception{
        try{
        	element = driver.findElement(By.id("account_logout"));
        
           // Log.info("Log Out link is found on the Home Page");
        }catch (Exception e){
        	//Log.error("Log Out link is not found on the Home Page");
       		throw(e);
       		}
       	return element;
    }
    
    
    		
    			static WebElement mainElement;
    			static WebElement subElement;
  		
    		public static void Agriculture() throws Exception{
    			try{
        			mainElement = driver.findElement(By.xpath("//*[@id='bs-megamenu']/ul/li[2]/a/span[2]"));
        			subElement =driver.findElement(By.xpath("//*[@id='bs-megamenu']/ul/li[2]/div/div/div/div/div/ul/li[1]/a/span"));
        			//Log.info("Product category link is found under Top Navigation");
        			System.out.println("Product category link is found under Top Navigation");
        			utilities.mouseHoverAction(mainElement,subElement,"AGRICULTURAL PRODUCTS");
    			}catch (Exception e){
    				//Log.error("Accessories link is not found under Product Category");
    				System.out.println("Accessories link is not found under Product Category");
    				throw(e);
    			}
               }
    		
    		public static void Food() throws Exception{
    			try{
        			mainElement = driver.findElement(By.xpath("//*[@id='bs-megamenu']/ul/li[2]/a/span[2]"));
        			subElement =driver.findElement(By.xpath("//*[@id='bs-megamenu']/ul/li[2]/div/div/div/div/div/ul/li[2]/a/span"));

        			
        		//	Log.info("Product category link is found under Top Navigation");
        			utilities.mouseHoverAction(mainElement,subElement,"SNACK AND SWEET");
    			}catch (Exception e){
    			//	Log.error("Accessories link is not found under Product Category");
    				throw(e);
    			}
               }
    		
    	/*	public static void iPads() throws Exception{
    			try{
        			mainElement = driver.findElement(By.linkText("Product Category"));
        			//Log.info("Product category link is found under Top Navigation");
        			utilities.mouseHoverAction(mainElement, "iPads");
    			}catch (Exception e){
    				//Log.error("Accessories link is not found under Product Category");
    				throw(e);
    			}
               }
    		
    		public static void iPhones() throws Exception{
    			try{
        			mainElement = driver.findElement(By.linkText("Product Category"));
        			//Log.info("Product category link is found under Top Navigation");
        			utilities.mouseHoverAction(mainElement, "iPhones");
    			}catch (Exception e){
    				//Log.error("Accessories link is not found under Product Category");
    				throw(e);
    			}
               }*/
    		
    	
    	
    
}




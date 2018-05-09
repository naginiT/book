package module;

import page.home;
import utility.Log;
import utility.excelutility;

public class selct {
	public static void productType() throws Exception{
		try{
			
			if("AGRICULTURAL PRODUCTS".equalsIgnoreCase(excelutility.getCellData(1,0))){
				
				home.Agriculture();
				System.out.println("Product Type Accessories is selected from the Top menu");
				
				Log.info("Product Type Accessories is selected from the Top menu");
				System.out.println("Product Type Accessories is selected from the Top menu");
			}
           if("SNACK AND SWEET".equalsIgnoreCase(excelutility.getCellData(1,0))){
				
				home.Food();
				System.out.println("Product Type Accessories is selected from the Top menu");
				
				//Log.info("Product Type Accessories is selected from the Top menu");
				System.out.println("Product Type Accessories is selected from the Top menu");
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}

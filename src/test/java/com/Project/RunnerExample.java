package com.Project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RunnerExample extends Base_Class1{
	
	public static WebDriver driver = browser_Launch();
	static String get_Text;
	static String get_Text2;
	static String string;
	static String get_Text4;
	SoftAssert c ;
	@Test(priority = 1)
	public static void wiki() {
          
		WikiPom a = new WikiPom(driver);
		 page_Launch("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		 
		  get_Text = get_Text(a.getRelease());
		// System.out.println(get_Text);
		 
		  get_Text2 = get_Text(a.getCountry());
	}
    @Test(priority = 2)
	public static void imdb() {
           ImbdPom b = new ImbdPom(driver);
           
           page_Launch("https://www.imdb.com/title/tt9389998/?ref_=nv_sr_srsg_0");
           
           String get_Text3 = get_Text(b.getRelease());
            
             string = get_Text3.split("(United States)")[0];
           
            get_Text4= get_Text(b.getCountry());
	}
	
	@Test(priority = 3)
	private void validate() {
               c= new SoftAssert(); 
               c.assertEquals(get_Text, string, "release date doesnt match");
               c.assertEquals(get_Text2, get_Text4, "release country doesnt match");
               c.assertAll();
	}
	
}

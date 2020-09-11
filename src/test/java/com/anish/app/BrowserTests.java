package com.anish.app;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTests {


    @Test
    public void testChrome()
    {
    	
    	ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.java.com");
		driver.quit();

    }
}


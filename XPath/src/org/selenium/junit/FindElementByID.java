package org.selenium.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByID {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", 
				 "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");	
		driver = new ChromeDriver();
			driver.get("http://www.baidu.com");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void checkInputTextBox(){
	
	WebElement element = driver.findElement(By.id ("kw"));
	System.out.println(element.getSize());
	Assert.assertEquals(driver.findElements(By.id("kw")).size(), 1);
	}
	
	@Test
	public void checkBaiduButton(){
	WebElement element =driver.findElement(By.id("su"));
	System.out.println(element.getSize());
	Assert.assertEquals(driver.findElements(By.id("kw")).size(), 1);
	}

}

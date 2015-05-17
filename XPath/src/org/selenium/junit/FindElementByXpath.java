package org.selenium.junit;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElementByXpath {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://flights.ctrip.com/");
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();	
	}
	 
	@Test
	public void test() {
		// 1) Method selection as:＂往返＂
					WebElement element = driver.findElement(By.xpath("//*[@id='radio_D']"));
					element.click();
					
			// 2) 出发城市　“西安”
					driver.findElement(By.id("DepartCity1TextBox")).clear();
					driver.findElement(By.id("DepartCity1TextBox")).sendKeys("西安(SIA)");
			// 3) Arrived city : "成都"
					driver.findElement(By.id("ArriveCity1TextBox")).clear();
					driver.findElement(By.id("ArriveCity1TextBox")).sendKeys("成都(CTU)");
			// 4） start date: 
					driver.findElement(By.xpath("//*[@id='DepartDate1TextBox']")).clear();
					driver.findElement(By.xpath("//*[@id='DepartDate1TextBox']")).sendKeys("2015-05-12");
				
					driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
			// 5) end date:
					driver.findElement(By.xpath("//*[@id='ReturnDepartDate1TextBox']")).clear();
					//driver.findElement(By.xpath("//*[@id='ReturnDepartDate1TextBox']")).sendKeys("2015-05-31");
					driver.findElement(By.xpath("//*[@id='ReturnDepartDate1TextBox']")).click();
					driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
				 
			// 6) click 'Search' button
					List<WebElement> elements = driver.findElements(By.xpath("//*[@id='search_btn']"));
					
					System.out.println(elements.size());
					
					Assert.assertEquals(elements.size(), 1);
					
					driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
					
			// 7) note down first group of price
			// 8) Exit Firefox browser
					String title = driver.getTitle();
					System.out.println("This page title is:"+ title);
							
	}

	
	
}

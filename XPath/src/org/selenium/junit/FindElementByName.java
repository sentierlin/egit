package org.selenium.junit;


import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementByName {

	private WebDriver driver;

	@Before
	public void before(){
	driver = new FirefoxDriver();
	driver.get("http://www.baidu.com");
	}
	
	@Test
	public void test() {
		
		//driver.navigate().to("http://www.baidu.com");
		WebElement element = driver.findElement(By.name("wd"));
		element.sendKeys("hello baidu");
		element.submit();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Page title is: " + driver.getTitle());
		
	}

	@After
	public void tearDown(){
		driver.quit();
				//driver.close();
	}
}

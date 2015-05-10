package org.selenium.junit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class FindElementByClass {

	private static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.qunar.com/");
	}
/*
	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}
*/
	@Test
	public void checkFromCity() throws InterruptedException {
		
		driver.findElement(By.id("js_searchtype_roundtrip")).click();
		System.out.println(driver.findElement(By.id("js_searchtype_roundtrip")).isSelected());
		
		driver.findElement(By.name("fromCity")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("fromCity")).sendKeys("北京(BJS)");
		RemoteWebElement elem = (RemoteWebElement)driver.findElement(By.name("fromCity"));
		System.out.println(elem.getText() + ";");
		Assert.assertEquals(elem.getAttribute("value"), "北京(BJS)");

	}
}

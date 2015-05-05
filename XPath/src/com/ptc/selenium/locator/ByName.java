package com.ptc.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByName {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
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
		//driver.quit();
		driver.close();
	}
}

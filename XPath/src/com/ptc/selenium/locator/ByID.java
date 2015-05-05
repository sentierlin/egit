package com.ptc.selenium.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByID {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.51testing.com");
		//WebElement element = driver.findElement(By.id("username"));
		WebElement element = driver.findElement(By.cssSelector("#password"));
		
		System.out.println(element.getTagName());
		driver.quit();
	}
}

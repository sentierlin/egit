package com.ptc.selenium.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByClassName {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		WebElement element = driver.findElement(By.className("s_ipt"));
        System.out.println(element.getTagName());
        driver.quit();
	}
}

package com.ptc.selenium.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrlAndTitle {
	public static void main(String[] args) {
		String url = "http://www.51testing.com";
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		// 得到title
		String title = driver.getTitle();
		// 得到当前页面url
		String currentUrl = driver.getCurrentUrl();
		// 输出title 和currenturl
		System.out.println(title + "\n" + currentUrl);
		
	}
}

package com.ptc.selenium.locator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class ExecuteAlert {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new FirefoxDriver(); ((JavascriptExecutor) driver)
		 * .executeScript("alert(\"hello,this is a alert!\")");
		 */

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.51testing.com");
		String js = "var user_input = document.getElementById(\"userpass\").title;return user_input;";
		String title = (String) ((JavascriptExecutor) driver).executeScript(js);
		System.out.println(title);

	}

}

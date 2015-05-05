package com.ptc.selenium.xpath;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestXpath {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
		driver.manage().window().maximize();
		
		//Find Element by xpath
		//WebElement element = driver.findElement(By.xpath("//*[@id='sb_form_q']"));
		
		//Find Element by class
		//WebElement element = driver.findElement(By.className("b_searchbox"));
		
		//Find Element by name
		//WebElement element = driver.findElement(By.name("q"));
		
		//Find Element by ID
		WebElement element = driver.findElement(By.id("sb_form_q"));
        element.sendKeys("Lynn");
		System.out.println(driver.getTitle());
		
		//Takes Screenshot
		OutputStream out = null;
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			out = new FileOutputStream ("D:\\test001.jpg");
			//FileUtils.copyFile(file, out);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
		Actions act = new Actions(driver);
		WebElement mess = driver.findElement(By.id("sb_form_q"));
		act.doubleClick(mess).perform();
		driver.quit();
	}

}

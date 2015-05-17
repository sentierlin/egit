package com.example.tests;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
public class GetCellData {
	WebDriver driver = new FirefoxDriver();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	@Test
	public void tableTest() { 	
	    driver.get("http://www.w3school.com.cn/html/html_tables.asp");   
	    //首先得到所有tr的集合
	    List<WebElement> rows = driver.findElements(By.cssSelector(".dataintable tr")); 
    	//验证表格的行数
	    assertEquals(11,rows.size());
         //打印出所有单元格的数据
	    for (WebElement row : rows) { 
	    	//得到当前tr里td的集合
	        List<WebElement> cols =  row.findElements(By.tagName("td")); 
	        for (WebElement col : cols) {
	        	System.out.print(col.getText());//得到td里的文本
	        }
	        System.out.println();
	    }
        driver.close();
	}
}


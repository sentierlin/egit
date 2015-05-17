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
	    //���ȵõ�����tr�ļ���
	    List<WebElement> rows = driver.findElements(By.cssSelector(".dataintable tr")); 
    	//��֤��������
	    assertEquals(11,rows.size());
         //��ӡ�����е�Ԫ�������
	    for (WebElement row : rows) { 
	    	//�õ���ǰtr��td�ļ���
	        List<WebElement> cols =  row.findElements(By.tagName("td")); 
	        for (WebElement col : cols) {
	        	System.out.print(col.getText());//�õ�td����ı�
	        }
	        System.out.println();
	    }
        driver.close();
	}
}


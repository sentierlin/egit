package org.selenium.junit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Configurator {
	 //public static final String DEFAULT_PROPERTIES= "org/selenium/junit/a.properties";
	 public static final String DEFAULT_PROPERTIES= "/org/selenium/junit/a.properties";
	 public static final String DEFINED_PROPERTIES = "b.properties";
	 private static Properties defaultsProperties = new Properties();
	 public static String writexmlfile = "d:" + File.separator + "writexmlfile.xml";  
	 public static String writePropertiesfile = "d:" + File.separator + "write.properties"; 
	 //private static Configurator INSTANCE = null;
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         try {
			//defaultsProperties.load(Configurator.class.getClassLoader().getResourceAsStream(DEFAULT_PROPERTIES));
			defaultsProperties.load(Configurator.class.getResourceAsStream(DEFAULT_PROPERTIES));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
         String url = defaultsProperties.getProperty("url"); 
         String username = defaultsProperties.getProperty("username");  
         String passsword = defaultsProperties.getProperty("password");  
        
         
         System.out.println(username);  
         System.out.println(passsword);  
         System.out.println(url);  
         
         
         Configurator.writePropertiesFileToXML(writexmlfile);
         Configurator.writePropertiesFile(writePropertiesfile);
	}
	 
	 public static void writePropertiesFileToXML(String filename)  
	    {  
	        Properties properties = new Properties();  
	        try  
	        {  
	            OutputStream outputStream = new FileOutputStream(filename);  
	            properties.setProperty("username", "lynn");  
	            properties.setProperty("password", "Abc123");  
	            properties.setProperty("chinese", "中文");  
	            properties.storeToXML(outputStream, "author: lynn@sina.com");  
	            outputStream.close();  
	        }  
	        catch (IOException e)  
	        {  
	            e.printStackTrace();  
	        }  
	    }  

	 public static void writePropertiesFile(String filename)  
	    {  
	        Properties properties = new Properties();  
	        try  
	        {  
	            OutputStream outputStream = new FileOutputStream(filename);  
	            properties.setProperty("username", "lynn");  
	            properties.setProperty("password", "Abc123");  
	            properties.setProperty("chinese", "中文");  
	            properties.store(outputStream, "author: lynn@sina.com");  
	            outputStream.close();  
	        }  
	        catch (IOException e)  
	        {  
	            e.printStackTrace();  
	        }  
	    }  
	 
}

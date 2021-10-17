package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	
	public static Properties getPropertiesObject() throws IOException
	{ 
		FileInputStream fb = new FileInputStream("C:\\Users\\GoogleTech\\eclipse-workspace\\MyTestNGProject\\Config\\config.properties");
		Properties prop = new Properties();
		prop.load(fb);
		return prop;
			
	}
	public  static String getUrl() throws Exception 
	{
		 return getPropertiesObject().getProperty("url");
		
	}
	
		
	public  static String getUsername() throws Exception 
	{
		 return getPropertiesObject().getProperty("username");
		
	}
	
	public  static String getPassword() throws Exception 
	{
		 return getPropertiesObject().getProperty("password");
		
	}
	
	public  static String getFirstname() throws Exception 
	{
		 return getPropertiesObject().getProperty("Firstname");
		
	}
	
	public  static String getLastname() throws Exception 
	{
		 return getPropertiesObject().getProperty("Lastname");
		
	}
	public  static String getpas() throws Exception 
	{
		 return getPropertiesObject().getProperty("Pass");
		
	}
	
	public  static String getemail() throws Exception 
	{
		 return getPropertiesObject().getProperty("email1");
		
	}
	
	public  static String getinvalidemail() throws Exception 
	{
		 return getPropertiesObject().getProperty("email2");
		
	}
	
	public  static String getinvalidpass() throws Exception 
	{
		 return getPropertiesObject().getProperty("pass2");
		
	}
	
	
	
	
	
}

package TestNGpackage;

import static util.ConfigReader.getFirstname;
import static util.ConfigReader.getLastname;
import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getUsername;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTask {

	
	WebDriver driver;
	//  ChromeDriver driver;
	  String baseUrl = "https://www.hobbycraft.co.uk/";	
   

	@Test(priority = 1)
	public void creatnewaccount() throws Exception
			{
		   
	 		WebElement myaccount  = driver.findElement(By.id("ctl00_hchdr1_myaccountlink1"));
	 		myaccount.click();
		   // find email field 
			  WebElement email  = driver.findElement(By.id("ctl00_con1_login1_emailtb2"));
			  email.sendKeys(getUsername());
			  
		   //find create your account Button
		  WebElement creataccount   = driver.findElement(By.id("ctl00_con1_login1_create1"));
		  creataccount.click();
		  
		  // find firstname input field
		  WebElement Firstname   = driver.findElement(By.id("ctl00_con1_ClubNewsletter1_firstnametb1"));
		  Firstname.sendKeys(getFirstname());
		  
		  // find lastname input field
		  WebElement lastname   = driver.findElement(By.id("ctl00_con1_ClubNewsletter1_lastnametb1"));
		  lastname.sendKeys(getLastname());
		  
		  // find Password input field
		  WebElement pass   = driver.findElement(By.id("ctl00_con1_ClubNewsletter1_passwordtb1"));
		  pass.sendKeys(getPassword());
		 
			  // find confirm Password input field
			  WebElement confirmpass   = driver.findElement(By.id("ctl00_con1_ClubNewsletter1_passwordtb2"));
			  confirmpass.sendKeys(getPassword());
		  
			  //find create account Button
			  WebElement accButton   = driver.findElement(By.id("ctl00_con1_ClubNewsletter1_create1"));
			  accButton.click();
			  System.out.println("Create My Account Successfully");
			  driver.navigate().back();
			  
			} // end of test1    
	
	@Test(priority = 2)
	public void signin() throws Exception 
	{
		 System.out.println("Sign In page");
		WebElement signin  = driver.findElement(By.id("ctl00_hchdr1_signinlink1"));
		signin.click();
		//find email field
		  WebElement email2  = driver.findElement(By.name("ctl00$con1$login1$emailtb1"));
		  email2.sendKeys(getUsername());
		 //find Pass fiels
		  WebElement pass2  = driver.findElement(By.name("ctl00$con1$login1$passtb1"));
		  pass2.sendKeys(getPassword());
		//find sing in /button 
		  
		  WebElement signBut   = driver.findElement(By.id("ctl00_con1_login1_signinbtn1"));
		  signBut.click();
		  System.out.println("signed Successfully");
		  driver.navigate().back();
	}
	/*
	@Test(priority = 2)
		public void invalidsignin() throws Exception 
	{
		WebElement signin  = driver.findElement(By.id("ctl00_hchdr1_signinlink1"));
		signin.click();
		//find email field
		  WebElement email2  = driver.findElement(By.name("ctl00$con1$login1$emailtb1"));
		  email2.sendKeys(getinvalidemail());
		 //find Pass fiels
		  
		  WebElement pass2  = driver.findElement(By.name("ctl00$con1$login1$passtb1"));
		  pass2.sendKeys(getinvalidpass());
		//find sing in /button 
		  
		  WebElement signBut   = driver.findElement(By.id("ctl00_con1_login1_signinbtn1"));
		  signBut.click();
		  System.out.println("signed Successfully");
		  
	}*/
	

	  @BeforeTest
	   public void init() throws Exception
	  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GoogleTech\\Documents\\ChromeDriver\\chromedriver.exe"); 
		 driver = new ChromeDriver();  
	     driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	     driver.manage().window().maximize(); 
	     driver.get(getUrl());
	     //driver.manage().deleteAllCookies();
		  	}
	  
}

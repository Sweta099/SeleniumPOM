package com.cg.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.cg.exception.BrowserNotCompatableException;

public class TestBase {
	
	public static WebDriver driver;
	Actions action;
	Properties prop;
	
	public TestBase()
	{
		prop=new Properties();
		try {
			prop.load(new FileInputStream("config//config.properties"));
			String browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			else
			{
				throw new BrowserNotCompatableException("Application doesnt support this browser");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotCompatableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void init()
	{
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
}

package com.brooke.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtils {
	private static WebDriver dr = null;
	
	public static WebDriver openFirefox(){
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		return dr;
	}
	
	public static WebDriver openChrome(){
		System.setProperty("webdriver.chrome.driver", "Files\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		return dr;
		
	}
	
	public static WebDriver openIE(){
		System.setProperty("webdriver.ie.driver", "Files\\IEDriverServer.exe");
		dr = new InternetExplorerDriver();
		dr.manage().window().maximize();
		return dr;
	}
	
	public void close(){
		dr.quit();
	}
}

package com.brooke.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	private By by(String type, String value){
		By by = null;
		if(type.equalsIgnoreCase("id")){
			by = By.id(value);
			
		}else if(type.equalsIgnoreCase("name")){
			by = By.name(value);
		}else if(type.equalsIgnoreCase("xpath")){
			by = By.xpath(value);
		}else if(type.equalsIgnoreCase("linkText")){
			by = By.linkText(value);
		}else if(type.equalsIgnoreCase("css")){
			by = By.cssSelector(value);
		}else if(type.equalsIgnoreCase("className")){
			by = By.className(value);
		}
		return by;
	}
	
	
	public static WebElement getElement(WebDriver dr, String type, String value, int time){
		WebElement element = null;
		
		ElementUtils elementUtils = new ElementUtils();
		By by = elementUtils.by(type, value);
		
		WebDriverWait wait = new WebDriverWait(dr,time);
		try {
		element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch(Exception e){
			throw new RuntimeException(dr.getCurrentUrl() + "页面的元素:" + type
					+ "=" + value + "没有找到");
		}
		return element;
	}
	
    public static List<WebElement> getElements(WebDriver dr, String type, String value, int time){
    	List<WebElement> elements = new ArrayList<WebElement>();
    	ElementUtils elementUtils = new ElementUtils();
    	By by = elementUtils.by(type, value);
    	
    	WebDriverWait wait = new WebDriverWait(dr, time);
    	try {
    	elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    	} catch (Exception e){
    		throw new RuntimeException(dr.getCurrentUrl() + "页面的元素:" + type
					+ "=" + value + "没有找到");
    	}
    	return elements;
    }
}

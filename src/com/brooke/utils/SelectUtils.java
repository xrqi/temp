package com.brooke.utils;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {
	private static Select select;
	
	public static void selectByText(WebDriver dr, String type, String value, 
			String text, int time){
		select = new Select(ElementUtils.getElement(dr, type, value, time));
		select.selectByVisibleText(text);
	}
	
	public static void selectByValue(WebDriver dr, String type, String value, 
			String selectValue, int time){
		select = new Select(ElementUtils.getElement(dr, type, value, time));
		select.selectByValue(selectValue);
	}
	
	public static void selectByIndex(WebDriver dr, String type, String value, 
			int selectIndex, int time){
		select = new Select(ElementUtils.getElement(dr, type, value, time));
		select.selectByIndex(selectIndex);
	}
	
	
	public static void selectByRandom(WebDriver dr, String type, String value, 
			int time){
		select = new Select(ElementUtils.getElement(dr, type, value, time));
		int indexs = select.getOptions().size();
		Random rnd = new Random();
		int index = rnd.nextInt(indexs);
		select.selectByIndex(index);
	}
}

package com.brooke.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShots {
	
	public static void shot(WebDriver dr){
		String dir_name = "ScreenShot";
		if(new File(dir_name).isDirectory()) {
			new File(dir_name).mkdir();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String date = sdf.format(new Date());
		
		File file = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(dir_name + File.separator + date + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

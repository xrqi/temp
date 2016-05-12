package cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class multiWindows {

	private  static WebDriver dr = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
        System.setProperty("webdriver.chrome.driver","Files\\chromedriver.exe");
        dr = new ChromeDriver();
    }

    @Test
	public void testMultiWindows() {
		dr.get("http://www.zhaopin.com/");
		dr.findElement(By.linkText("选择城市")).click();
		String[] handles = new String[dr.getWindowHandles().size()];
		dr.getWindowHandles().toArray(handles);
		dr = dr.switchTo().window(handles[1]);
		
//		dr.findElement(By.linkText("北京")).click();
		dr.findElement(By.linkText("手机求职")).click();
		
		handles = new String[dr.getWindowHandles().size()];
		dr.getWindowHandles().toArray(handles);
		dr = dr.switchTo().window(handles[2]);
		dr.findElement(By.linkText("注册")).click();
		
		

		  
	}

}

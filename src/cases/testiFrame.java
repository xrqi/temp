package cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class testiFrame {
	private  static WebDriver dr = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
        System.setProperty("webdriver.chrome.driver","Files\\chromedriver.exe");
        dr = new ChromeDriver();
    }
    
    
    @Test
	public void iFrame() {
		dr.get("http://special.zhaopin.com/sh/2009/aboutus/join.html");
		dr.switchTo().frame(dr.findElement(By.xpath("/html/body/iframe")));
		dr.findElement(By.linkText("÷«¡™ΩÈ…‹")).click();
		dr.switchTo().defaultContent();
		dr.findElement(By.xpath("//*[@id=\"nav\"]/li[2]")).click();
	
	}
    
    @Test
    public void test(){
    	dr.get("http://www.zhaopin.com/");
    	dr.findElement(By.linkText("…œ∫£")).click();
    	String title = dr.getTitle();
    	String url = dr.getCurrentUrl();
    	System.out.println("title:" + title);
    	System.out.println("url:" + url);
    	String text = dr.findElement(By.xpath("//*[@id=\"globalHeader\"]/div/div[1]/a[1]/h3")).getText();
    	System.out.println("text:" + text);    	
    }
    

  @AfterClass
  public void afterClass() {
  }

}

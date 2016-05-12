package cases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class isSelected {
	private  static WebDriver dr = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
        System.setProperty("webdriver.chrome.driver","Files\\chromedriver.exe");
        dr = new ChromeDriver();
    }
    
/*    
    @Test
	public void isSelect() {
		dr.get("http://passport.zhaopin.com/");
		System.out.println("isSelected:" + dr.findElement(By.id("RememberMe")).isSelected());
		dr.findElement(By.id("RememberMe")).click();
		System.out.println("isSelected:" + dr.findElement(By.id("RememberMe")).isSelected());
		System.out.println("tagName:" + dr.findElement(By.id("RememberMe")).getTagName());
		System.out.println("isEnabled:" + dr.findElement(By.id("RememberMe")).isEnabled());
		System.out.println("isDisplayed:" + dr.findElement(By.id("RememberMe")).isDisplayed());
		System.out.println("attribute:" + dr.findElement(By.id("RememberMe")).getAttribute("type"));
	}
*/    
	@Test
	public void test3(){
		dr.get("http://www.zhaopin.com/");
		dr.findElement(By.linkText("Ñ¡Ôñ³ÇÊÐ")).click();
		//dr.close();
		dr.quit();
	}
  @AfterClass
  public void afterClass() {
	  
  }

}

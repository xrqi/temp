package cases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestNGLearn1 {
	private  static WebDriver dr = null;

    @BeforeClass
    public void beforeClass() {
        System.out.println("this is before class");
        System.setProperty("webdriver.chrome.driver","Files\\chromedriver.exe");
        dr = new ChromeDriver();
    }
    

    

    @Test
    public void TestNgLearn() {
        System.out.println("this is TestNG test case");
        dr.get("http://www.zhaopin.com/");
     
//        dr.get("http://sou.zhaopin.com/jobs/searchresult.ashx?jl=����&kw=�������&sm=0&p=1");
//        WebElement element = dr.findElement(By.id("KeyWord_kw2"));
//        System.out.println("element:" + element.toString());     
//        List<WebElement> list = dr.findElements(By.name("vacancyid"));
//        System.out.println("list:" + list);
        dr.findElement(By.id("KeyWord_kw2")).sendKeys("�������");
        dr.findElement(By.id("KeyWord_kw2")).clear();
        dr.findElement(By.id("KeyWord_kw2")).sendKeys("java����");
//        dr.findElement(By.class("")).click();
        dr.findElements(By.className("doSearch")).get(0).click();
        
    }   
    
    
    @Test
	public void testSelect() {
		dr.get("http://sou.zhaopin.com/");
		Select select = new Select(dr.findElement(By.id("Release-time")));
//		select.selectByIndex(3);
//		select.selectByValue("3");
		select.selectByVisibleText("����");
		  
	}
    
    @Test
	public void testMultiWindows() {
		dr.get("http://www.zhaopin.com/");
		dr.findElement(By.linkText("ѡ�����")).click();
		String[] handles = new String[dr.getWindowHandles().size()];
		dr.getWindowHandles().toArray(handles);
		dr = dr.switchTo().window(handles[1]);
		dr.findElement(By.linkText("����")).click();
		
		Select select = new Select(dr.findElement(By.id("Release-time")));
//		select.selectByIndex(3);
//		select.selectByValue("3");
		select.selectByVisibleText("����");
		  
	}

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class");
    }
}




//import java.util.concurrent.TimeUnit;
 
//import org.openqa.selenium.PageLoadStrategy;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Run1
   {

	public static void main(String[] args) throws InterruptedException
	
	{
		
      WebDriver driver= new ChromeDriver();
      driver.get("http://desktop-9pnleie/login.do");
      
    // driver.findElement(By.name("username")).sendKeys("admin");
    //  driver.findElement(By.name("pwd")).sendKeys("manager");
    // driver.findElement(By.id("loginButton")).click();
      Thread.sleep(2000);
      //driver.findElement(By.linkText("Tasks")).click();
      
      WebElement un=driver.findElement(By.name("username"));//findElement,xpath
      un.sendKeys("admin");
      WebElement pwd=driver.findElement(By.name("pwd"));
      pwd.sendKeys("manager");
      Thread.sleep(2000);
      WebElement login= driver.findElement(By.id("loginButton"));
     System.out.println(login.getLocation().getX());
     System.out.println(login.getLocation().getY());
      login.click();
     Thread.sleep(2000);
     driver.findElement(By.linkText("Settings")).click();
     Thread.sleep(2000);
    // List<WebElement> l1=driver.findElements(By.xpath("//td/input[@type='checkbox']"));
     driver.findElement(By.linkText("Logo & Color Scheme")).click();
     Thread.sleep(2000);
   WebElement rr=driver.findElement(By.xpath("//input[@id='keepCurrentCustomLogoOption']"));
	
   System.out.println(rr.isSelected());
 WebElement rr1=driver.findElement(By.xpath("//input[@id='uploadNewReportLogoOption']"));
 WebElement f1=driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
 System.out.println(f1.isEnabled());
 rr1.click();
 System.out.println(f1.isEnabled());
 
   
   /*
		 * WebElement color=driver.findElement(By.name("colorScheme"));
		 * 
		 * Select cc=new Select(color); cc.selectByValue("aquamarine");
		 * Thread.sleep(2000); cc.selectByIndex(4); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//option[@value='ferngreen']")).click();
		 * Thread.sleep(2000); // List<WebElement> l2=cc.getOptions();
		 * System.out.println(cc.isMultiple());
		 * 
		 */   // driver.findElement(By.linkText("Tasks")).click();      
          
      //System.out.println(driver.getWindowHandle());
      
		/*
		 * driver.manage().window().maximize(); Thread.sleep(2000);
		 * driver.manage().window().minimize(); Thread.sleep(2000);
		 */ // System.out.println(.m.getTitle());
      //driver.switchTo().window("1BD65508C0A4AAD5784BF0802F39A25D");
     // Thread.sleep(2000);
     // driver.navigate().forward();
             
      //driver.findElement(By.linkText("Users")).click();
     // Thread.sleep(2000);
   /* driver.findElement(By.xpath("//input[@value='Create New User']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sangeetha");
     Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sangeetha");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(("N"));
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("user1");
    driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("user1");
    
   
driver.findElement(By.xpath("//input[@type='submit']")).click();  */

   //driver.findElement(By.linkText("N, Sangeetha (sangeetha)")).click();
   // driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
  
  //input[@id='cleanupDemoDataButton']
		
	}

}

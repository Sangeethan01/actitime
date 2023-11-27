import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Run8 {

	public static void main(String[] args)  throws InterruptedException, Exception
	{
		
		//Window Handling 
		//Robot Events
		 WebDriver driver= new ChromeDriver();
	      driver.get("http://desktop-9pnleie/login.do");
	      
	      WebElement un=driver.findElement(By.name("username"));//findElement,xpath
	      un.sendKeys("admin");
	      WebElement pwd=driver.findElement(By.name("pwd"));
	      pwd.sendKeys("manager");
	      Thread.sleep(2000);
	      WebElement login= driver.findElement(By.id("loginButton"));
	      login.click();
	      Thread.sleep(2000);
	     
	      Actions act=new Actions(driver);
	      WebElement users=driver.findElement(By.xpath("//div[text()='Users']"));
	      
	    act.contextClick(users).perform();
	   Robot rbt=new Robot();
	   rbt.keyPress(KeyEvent.VK_DOWN);
	   Thread.sleep(2000);
	   rbt.keyPress(KeyEvent.VK_DOWN);
	   Thread.sleep(2000);
	   rbt.keyPress(KeyEvent.VK_ENTER);
	   Thread.sleep(2000);
	   
	   String active=driver.getWindowHandle();
	   System.out.println("Active Window" +active);
	   
	   Set<String> s1=driver.getWindowHandles();
	   Iterator<String> it=s1.iterator();
	   String parent=it.next();
	   String child=it.next();
	   
	   System.out.println("Parent Window" +parent);
	   System.out.println("Child Window" +child);
	   driver.switchTo().window(child);
	   
	   driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	    
	    	
	}

}

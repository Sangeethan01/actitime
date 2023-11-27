import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Run7 
{
	 static Actions act=null;
	static void back_space(int n)
	{
		for(int i=0;i<=n;i++)
		{
			act.sendKeys(Keys.BACK_SPACE).perform();
		}
	}
	 
	public static void main(String[] args) throws InterruptedException
	
	{
		
		 WebDriver driver= new ChromeDriver();
	      driver.get("http://desktop-9pnleie/login.do");
	      
	      WebElement un=driver.findElement(By.name("username"));//findElement,xpath
	      //un.sendKeys("admin");
	     // WebElement pwd=driver.findElement(By.name("pwd"));
	      //pwd.sendKeys("manager");
	      Thread.sleep(2000);
	     
	      Actions act=new Actions(driver);
	      act.sendKeys(un,"admin").perform();
	      Thread.sleep(2000);
	      
	      //act1.sendKeys(Keys.BACK_SPACE).perform();
	      Thread.sleep(2000);
	      Run7.back_space(3);
	          
	        		  
	}
}

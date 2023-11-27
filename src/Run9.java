import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run9 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Alerts and Pop-Ups
	WebDriver driver=new ChromeDriver();
	driver.get("http://desktop-9pnleie/login.do");
	WebElement un=driver.findElement(By.name("username"));//findElement,xpath
    un.sendKeys("admin");
    WebElement pwd=driver.findElement(By.name("pwd"));
    pwd.sendKeys("manager");
    Thread.sleep(2000);
    WebElement login= driver.findElement(By.id("loginButton"));
    login.click();
    Thread.sleep(2000);
   
    
    driver.findElement(By.linkText("Users")).click();
	Thread.sleep(2000);
	 driver.findElement(By.linkText("Berry, Matt (manager)")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
	Thread.sleep(2000);
	
	Alert alt=driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(alt.getText());
	Thread.sleep(2000);
	alt.dismiss();
	

	}

}

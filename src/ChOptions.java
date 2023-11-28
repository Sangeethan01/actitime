import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChOptions
{

	public static void main(String[] args) throws InterruptedException 
	{
				
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
			WebDriver driver=new ChromeDriver(options);
			
			   
			driver.get("http://desktop-9pnleie/login.do");
			WebElement un=driver.findElement(By.name("username"));//findElement
		    un.sendKeys("admin");
		    WebElement pwd=driver.findElement(By.name("pwd"));
		    pwd.sendKeys("manager");
		    Thread.sleep(2000);
		    WebElement login= driver.findElement(By.id("loginButton"));
		    login.click();
		    Thread.sleep(2000);
		    
		}

}

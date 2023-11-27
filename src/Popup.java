import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup
{

	public static void main(String[] args) throws InterruptedException 
	{
		
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
	    driver.findElement(By.linkText("Tasks")).click();
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Completed Tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='taskSelected[39]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete Selected Tasks']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@onclick='deleteConfirmDlg.close()']")).click();
	    

	}

}

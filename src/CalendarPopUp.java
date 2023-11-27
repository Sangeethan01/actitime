import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopUp {

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
		//driver.findElement(By.id("ext-gen7")).click();
		driver.findElement(By.xpath("//input[@name='completionDateFrom.userText' and contains(@class,'text')]/following-sibling::img")).click();
		
		String month_year="May 2024";
		String date="16";
		
		int i=1;
		while(i<=12)
		{
			try
			{
				driver.findElement(By.xpath("//button[text()='"+month_year+"']/ancestor::tbody[2]/descendant::span[text()='"+date+"']")).click();
				break;
			}
			catch(Throwable t)
			{
				driver.findElement(By.xpath("//a[contains(@title,'Next Month')]")).click();
				i++;
			}
		}
	}

}

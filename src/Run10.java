import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Run10 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//Frame Handling
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		Thread.sleep(2000);
		driver.switchTo().frame("frame3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
		Thread.sleep(2000);
		Select sel=new Select(animals);
		sel.selectByValue("babycat");
		
	}

}

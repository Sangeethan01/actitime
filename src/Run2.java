import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run2 
{
	public static void main(String[] args) throws InterruptedException
	
	{
	
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.in/");
		Thread.sleep(2000);
//dr.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro");
	dr.findElement(By.xpath("//input[@id='nav-bb-search']")).sendKeys("iphone 15 pro");
dr.findElement(By.xpath("//input[@class='nav-bb-button']")).click();
Thread.sleep(2000);
dr.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro (128 GB) - Blue Titanium']")).click();
Thread.sleep(2000);
dr.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//input[@id='add-to-cart-button']



	}
}
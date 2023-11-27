import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Run4 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		
		WebElement sign_in= driver.findElement(By.xpath("//span[text()='Sign In']"));
		int x=sign_in.getLocation().getX();
		int y=sign_in.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		act.moveByOffset(x, y).perform(); //moveByOffset,moveToElement
		Thread.sleep(2000);
		WebElement Career= driver.findElement(By.xpath("//a[text()='Career']"));
		int a=Career.getLocation().getX();
		int b=Career.getLocation().getY();
		System.out.println(a);
		System.out.println(b);
		act.moveToElement(sign_in, -162,-12).perform();
		Thread.sleep(2000);
		act.contextClick(sign_in).perform();
		
		
		//WebElement Paytm_Consumer= driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		//act.moveToElement(Paytm_Consumer).perform();
		//Thread.sleep(2000);
		//act.moveToElement(driver.findElement(By.xpath("//a[text()='Ticket booking']"))).perform();
		//Thread.sleep(2000);
	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run3 
{
	
public static void main(String[] args) throws InterruptedException
	
	{
	
		WebDriver dr=new ChromeDriver();
		dr.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
		
		dr.findElement(By.name("identifier")).sendKeys("sangi.nsk@gmail.com");//gmail
		dr.findElement(By.xpath("//span[text()='Next']")).click();
	}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-9pnleie/login.do");
		WebElement un=driver.findElement(By.name("username"));
	    un.sendKeys("admin");
	    WebElement pwd=driver.findElement(By.name("pwd"));
	    pwd.sendKeys("manager");
	    Thread.sleep(2000);
	    WebElement login= driver.findElement(By.id("loginButton"));
	    login.click();
	    

	}

}

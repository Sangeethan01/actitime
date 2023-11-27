import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Run6 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
				//click and hold
				//build()
				//scrollToElement
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement box=driver.findElement(By.xpath("//div[text()='CAT' and contains(@id,'box')]"));
		WebElement box1=driver.findElement(By.className("dropBox"));
		WebElement e1=driver.findElement(By.xpath("//a[text()='Drag And Drop scripts from DHTMLGoodies.com']"));
		Actions act=new Actions(driver);
		act.clickAndHold(box).moveToElement(box1).release().build().perform();
		Thread.sleep(2000);
		act.scrollToElement(e1).perform();
	

	}

}

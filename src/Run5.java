import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Run5 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//driver.get("http://www.dhtmlgoodies.com/scripts/dg-crop/dg-crop.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
				
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//WebElement drag_drop=driver.findElement(By.xpath("//div[text()='DOG' and contains(@id,'box')]"));
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='dragableBox' and contains(@id,'box')]"));
		WebElement drop_box=driver.findElement(By.className("dropBox"));
		Actions act=new Actions(driver);
		
		for(WebElement x:l1)
		
		{
		act.dragAndDrop(x,drop_box).perform();
		Thread.sleep(2000);

	}
	}
}

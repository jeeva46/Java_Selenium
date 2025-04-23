package Week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AjioWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement enter = driver.findElement(By.xpath("//div[@class='searchbar-view']//input[@name='searchVal']"));

		enter.sendKeys("Bags");
		
		enter.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='facet-body'])[1]//label[contains(@class,'facet-linkname-Men')]")).click();
	}

}

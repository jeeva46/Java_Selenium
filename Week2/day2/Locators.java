package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		//driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Accounts']")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		WebElement drive = driver.findElement(By.name("industryEnumId"));
		
		Select s = new Select(drive);
		s.selectByVisibleText("Computer Software");
		
		
		drive = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		s = new Select(drive);
		s.selectByVisibleText("S-Corporation");
		
		
		
		
	}

	
}

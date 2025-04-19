package Week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get(" http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.className("crmsfa")).click();
		
		driver.findElement(By.xpath("//div[@class='x-panel-header']//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		
		
		
		
		

	}

}

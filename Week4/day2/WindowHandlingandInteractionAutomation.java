package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandlingandInteractionAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.className("crmsfa")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//img[@alt='Lookup'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> window = new ArrayList<>(windowHandles);
		
		driver.switchTo().window(window.get(1));
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("(//table[@class='twoColumnForm']//img[@alt='Lookup'])[2]")).click();
		
		Set<String> window1 = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<>(window1);
		
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//a[contains(@href,'DemoCustomer')]")).click();
		
		driver.switchTo().window(windows.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
		
		

	}

}

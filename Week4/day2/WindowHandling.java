package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> window = driver.getWindowHandles();
		
		List<String> windowid = new ArrayList<>(window);
		
		driver.switchTo().window(windowid.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(windowid.get(0));
		
		driver.close();

	}

}

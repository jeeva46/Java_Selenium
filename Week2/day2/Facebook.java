package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get(" https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("email")).sendKeys(" testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		Thread.sleep(3000);
//		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		System.out.println(driver.getTitle());
	}

}

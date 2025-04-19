package Week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Leaftap_Leads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.cssSelector("input.decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Demo_Jeeva");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("v");
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL_QA");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA_Test");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("span#viewLead_generalProfTitle_sp")).getText());
		
//		Thread.sleep(5000);
//		
//		driver.close();
		
		

	}

}

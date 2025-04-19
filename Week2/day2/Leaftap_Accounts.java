package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leaftap_Accounts {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Democsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.className("crmsfa")).click();
		
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Accounts']")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("SA");
		
		WebElement element = driver.findElement(By.name("industryEnumId"));
		
		Select drop = new Select(element);
		
		drop.selectByVisibleText("Computer Software");
		
		WebElement elements = driver.findElement(By.name("ownershipEnumId"));
		
		Select d = new Select(elements);
		
		d.selectByVisibleText("S-Corporation");
		
		WebElement ele = driver.findElement(By.id("dataSourceId"));
		
		Select s = new Select(ele);
		
		s.selectByValue("LEAD_EMPLOYEE");
		
		WebElement e = driver.findElement(By.id("marketingCampaignId"));
		
		Select a = new Select(e);
		
		a.selectByIndex(6);
		
		WebElement l = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select sel = new Select(l);
		
		sel.selectByValue("TX");
		
		driver.findElement(By.cssSelector("input.smallSubmit")).click();
		
		//driver.close();
		
		
		
		
		
	}
	

}

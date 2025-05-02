package Week5.day1;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IndainRailway {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a = new Actions(driver);
		
		WebElement search1 = driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		
		a.moveToElement(search1).doubleClick().sendKeys("MAS").build().perform();
		
		driver.findElement(By.xpath("//div[@class='autocomplete']/div[@title='Mgr Chennai Ctr']")).click();	
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='txtStationTo']"))).doubleClick().sendKeys("MDU").perform();
		
		driver.findElement(By.xpath("//div[@class='autocomplete']/div[@title='Madurai Jn']")).click();
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> trainList = driver.findElements(By.xpath("(//div[@id='divTrainsList']//tbody)[1]/tr/td[2]"));
		
		for(WebElement elements: trainList) {
			System.out.println(elements.getText());
		}
		
		Set<WebElement> s = new HashSet<>(trainList);
		
		System.out.println(s.containsAll(trainList));
		
	}

}

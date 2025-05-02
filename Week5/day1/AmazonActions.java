package Week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;




public class AmazonActions {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a = new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		
		a.moveToElement(search).click().sendKeys("oneplus 9 pro").sendKeys(Keys.ENTER).perform();
		
		String Price = driver.findElement(By.xpath("(//*[@class='puisg-col-inner']//span[@class='a-price-whole'])[1]")).getText();
		
		System.out.println("price: "+ Price);
		
		String rating = driver.findElement(By.xpath("(//div[@data-cy='reviews-block']//span[contains(@class,'a-size-base')])[1]")).getText();
		
		System.out.println("Rating: "+ rating);
		
		driver.findElement(By.xpath("(//div[@data-cy='title-recipe']/a[contains(@class,'a-link-normal')])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> iterator = windowHandles.iterator();
		
		String parentwindow = iterator.next();
		
		String childwindow = iterator.next();
		
		driver.switchTo().window(childwindow);
		
		//driver.findElement(By.xpath("//*[@id='nav-logo-sprites']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='productTitle']")));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\jeeva\\Downloads\\demo.png"));
		
		driver.findElement(By.xpath("(//input[@name='submit.add-to-cart'])[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='attach-accessory-cart-subtotal'])[1]")));
		
		String cartPrice = driver.findElement(By.xpath("(//*[@id='attach-accessory-cart-subtotal'])[1]")).getText();
		
		System.out.println(cartPrice);
		//Assert.assertEquals(Price, cartPrice);
		
		driver.quit();
		
		
		
	}

}

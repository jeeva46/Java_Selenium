package Week3.day2;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Axis {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://omni.axisbank.co.in/axisretailbanking/");
		
		driver.manage().window().maximize();
//		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("APPREGI")).click();
		
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c92-10']/input")).sendKeys("123456789");
		
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\jeeva\\Downloads\\p.png"));
		
		
	}
	

	

}

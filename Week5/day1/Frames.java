package Week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		
		System.out.println(text);

	}

}

package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookNewAcccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jeeva");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("A V");
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(drop);
		
		s.selectByValue("1");
		
		WebElement monthdrop = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select ss = new Select(monthdrop);
		
		ss.selectByVisibleText("Jun");
		
		WebElement yeardrop = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s1 = new Select(yeardrop);
		
		s1.selectByValue("1999");
		
		driver.findElement(By.xpath("//span[@data-name='gender_wrapper']//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@aria-label='Mobile number or email address']")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//div[@id='reg_form_box']//input[@id='password_step_input']")).sendKeys("ABC@23345");

	}

}

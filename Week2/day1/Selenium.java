package Week2.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ChromeDriver driver = new ChromeDriver();
		
		//webdriver is an interface, chromedriver class implements the webdriver interface
		WebDriver driver = new ChromeDriver();
		
		//launch the browser
		driver.get("https://facebook.com");
		
		//by default browser in min, to max use the below code
		driver.manage().window().maximize();
		
		//print the title of the page
		System.out.println(driver.getTitle());
		
		//print the page url
		System.out.println(driver.getCurrentUrl());
		
		//close the current page 
		driver.close();
		
		//close all the page which opened by selenium 
		driver.quit();
		
		
		
	}

}

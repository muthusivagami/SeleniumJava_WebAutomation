package PART1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("rms@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("lotus");

	}

}

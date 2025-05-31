package PART1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("rms@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Lambda");
	
	}

}

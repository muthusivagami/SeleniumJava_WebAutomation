package PART1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		//parent window 
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//to open child window
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		

	}

}

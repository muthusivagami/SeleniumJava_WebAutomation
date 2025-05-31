package PART1;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.getTitle();
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		driver.getPageSource();
		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
	}

}

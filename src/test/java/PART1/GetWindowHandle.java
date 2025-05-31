package PART1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//getwindowhandle will give the page window ID
		driver.get("https://www.instagram.com");
		
	}
	
	
	
	
}

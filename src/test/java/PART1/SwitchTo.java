package PART1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.Iterator;

public class SwitchTo {

	public static void main(String[] args) {
		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();
		
		// Navigate to a website that opens multiple windows
		driver.get("https://www.example.com");  // Replace with your actual URL
		
		// Get the handle of the main window
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main Window Handle: " + mainWindowHandle);
		
		// Get all window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		// Print total number of windows
		System.out.println("Total windows: " + allWindowHandles.size());
		
		// Iterate through all windows
		Iterator<String> iterator = allWindowHandles.iterator();
		while (iterator.hasNext()) {
			String childWindow = iterator.next();
			if (!mainWindowHandle.equals(childWindow)) {
				// Switch to child window
				driver.switchTo().window(childWindow);
				System.out.println("Child Window Title: " + driver.getTitle());
				
				// Perform operations in child window here
				
				// Close child window
				driver.close();
			}
		}
		
		// Switch back to main window
		driver.switchTo().window(mainWindowHandle);
		
		// Close the browser
		driver.quit();
	}

}

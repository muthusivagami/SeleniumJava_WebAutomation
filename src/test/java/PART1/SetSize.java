package PART1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	//whenever we use thread.sleep, must use throws interruptedexception in main
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//method1 (preferred)- only one line
		driver.manage().window().setSize(new Dimension(500, 500) );
		
		//method2 by creating object but with two lines
		/*Dimension size = new Dimension(500,500);
		driver.manage().window().setSize(size);*/
		
		Point pos= driver.manage().window().getPosition();
		System.out.println(pos.getX());
		System.out.println(pos.getY());

		driver.manage().window().setPosition(new Point(150,70));
	}

}

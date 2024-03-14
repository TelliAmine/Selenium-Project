package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// access to navigator
		WebDriver driver = new ChromeDriver();
		// Maximaze Window
		driver.manage().window().maximize();
		// access to the website
		driver.get("https://demoqa.com/menu");
		Thread.sleep(5000);

		// Declaration
		WebElement itemMenu;
		itemMenu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));

		// Actions
		Actions action = new Actions(driver);
		action.moveToElement(itemMenu).perform();
		System.out.println();

	}

}

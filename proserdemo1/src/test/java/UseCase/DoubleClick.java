package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// access to navigator
		WebDriver driver = new ChromeDriver();
		// Maximaze Window
		driver.manage().window().maximize();
		// access to the website
		driver.get("https://demoqa.com/buttons");

		Thread.sleep(5000);
		// Identification
		WebElement dblClickbtn, rightClickbtn, clickbtn;
		dblClickbtn = driver.findElement(By.id("doubleClickBtn"));
		rightClickbtn = driver.findElement(By.id("rightClickBtn"));
		// clickbtn = driver.findElement(By.id("Ca7wm"));

		// Actions
		Actions action = new Actions(driver);
		action.doubleClick(dblClickbtn).perform();
		Thread.sleep(5000);
		// Verification doubleclick
		WebElement messageDblclick;
		messageDblclick = driver.findElement(By.id("doubleClickMessage"));
		String TextmessageDblclick;
		TextmessageDblclick = messageDblclick.getText();
		Assert.assertEquals(TextmessageDblclick, "You have done a double click");

		System.out.println("Test OK");
		driver.close();

	}

}

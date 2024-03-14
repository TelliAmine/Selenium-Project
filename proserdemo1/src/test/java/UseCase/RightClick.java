package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// access to driver
		WebDriver driver = new ChromeDriver();
		// access to browser
		driver.get("https://demoqa.com/buttons");
		// Maximaze window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		// Declaration
		WebElement rightBtnClick;
		// Identification Element
		rightBtnClick = driver.findElement(By.id("rightClickBtn"));
		// Actions
		Actions Action = new Actions(driver);
		Action.contextClick(rightBtnClick).perform();

		// Verification
		WebElement messageRigntclick;
		messageRigntclick = driver.findElement(By.id("rightClickMessage"));
		String messageRightClicktext;
		messageRightClicktext = messageRigntclick.getText();
		Assert.assertEquals(messageRightClicktext, "You have done a left click");
		System.out.println("test is ok");
        driver.close();
	}

}

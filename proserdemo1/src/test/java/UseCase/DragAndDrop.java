package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Access to driver
		WebDriver driver = new ChromeDriver();
		// Access to navigation
		driver.get("https://demoqa.com/droppable");
		// maximaze window
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Declaration
		WebElement DragBox, DropBox;
		// Identification
		DropBox = driver.findElement(By.id("droppable"));
		DragBox = driver.findElement(By.id("draggable"));
		// Actions
		Actions action = new Actions(driver);
		action.dragAndDrop(DragBox, DropBox).perform();
		// Verification
		WebElement droppedMessage;
		droppedMessage = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		String droppedMessegeText;
		droppedMessegeText = droppedMessage.getText();
		Assert.assertEquals(droppedMessegeText, "Dropped!");
		System.out.println("Test is Ok");
	}

}

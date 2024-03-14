package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Maximaze Window
		driver.manage().window().maximize();
		// access to the website
		driver.get("https://demoqa.com/select-menu");
		// wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Declaration
		WebElement List;

		// Identification
		List = driver.findElement(By.id("oldSelectMenu"));

		// Select Action
		Select oldSelect = new Select(List);
		oldSelect.selectByValue("7");

	}

}

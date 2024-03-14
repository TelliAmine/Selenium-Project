package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access driver
		WebDriver driver = new ChromeDriver();
		// Acess browser
		driver.navigate().to("https://www.google.com/");
		// maximaze window
		driver.manage().window().maximize();
		// wait implicit
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// declaration
		WebElement input;
		// identification
		input = driver.findElement(By.name("q"));
		// Actions
		input.sendKeys("Syria");
		input.sendKeys(Keys.ENTER);



		// Verification
		String currentLink;
		currentLink = driver.getCurrentUrl();

		if (currentLink.contains("tunisia")) {

			System.out.println(" ok");
		} else {
			System.out.println(" not ok");
		}

	}

}

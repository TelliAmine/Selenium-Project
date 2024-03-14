package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TextNewPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access driver
		WebDriver driver = new FirefoxDriver();
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
		WebElement syrialocat;
		syrialocat = driver
				.findElement(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div[3]/div/div[1]/div/div/div/div[1]/div/div"));
		String syriaText;
		syriaText = syrialocat.getText();
		Assert.assertEquals(syriaText, "tunisie");
		System.out.println("test ok");
	}

}

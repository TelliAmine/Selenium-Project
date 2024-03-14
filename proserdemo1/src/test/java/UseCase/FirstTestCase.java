package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Start the session ,Open navigator
		// WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		// maximaze window
		driver.manage().window().maximize();
		// Take action on browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// sleep
		Thread.sleep(5000);
		// Declaration
		WebElement user, mdp, login;
		// identification
		user = driver.findElement(By.name("username"));
		mdp = driver.findElement(By.name("password"));
		login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

		// Actions

		user.sendKeys("Admin");
		mdp.sendKeys("admin123");
		login.click();
		Thread.sleep(5000);
		// Result verification

		WebElement profile;
		profile = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profile.getText();
		Assert.assertEquals(text, "Test Name Teste");
		System.out.println("Test OK");
	}

}

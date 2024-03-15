import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiAuth {
	WebDriver driver;

	@Given("Access to driver")
	public void access_to_driver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Given("Access to url {string}")
	public void access_to_url(String string) {
		driver.navigate().to(string);
	}

	@When("I input the username  for the {string}")
	public void i_input_the_username_for_the(String string) {
		WebElement username;
		username = driver.findElement(By.name("username"));
		username.sendKeys(string);

	}

	@When("I input the password  for the {string}")
	public void i_input_the_password_for_the(String string) {
		WebElement password;
		password = driver.findElement(By.name("password"));
		password.sendKeys(string);
	}

	@When("I click the loginbutton")
	public void i_click_the_loginbutton() {
		WebElement loginBtn;
		loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		loginBtn.click();
	}

	@Then("I verify the  {string}")
	public void i_verify_the(String string) {
		WebElement message;
		message = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String messageText;
		messageText = message.getText();
		Assert.assertEquals(messageText, string);

	}

}

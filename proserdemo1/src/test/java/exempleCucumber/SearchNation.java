package exempleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchNation {
	WebDriver driver;

	@Given("access driver")
	public void access_driver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("access browser {string}")
	public void access_browser(String string) {

		driver.get(string);
	}

	@When("input name of nation {string}")
	public void input_name_of_nation(String string) {
		WebElement nationName;
		nationName = driver.findElement(By.name("q"));
		nationName.sendKeys(string);

	}

	@When("click button enter")
	public void click_button_enter() {
		WebElement nationName;
		nationName = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.sendKeys(nationName, Keys.ENTER).perform();
		;
	}

	@Then("I check that the result contains the word  {string}")
	public void i_check_that_the_result_contains_the_word(String string) {
		String textLink;
		textLink = driver.getCurrentUrl();
		// Assert.assertEquals(textLink, string);
		if (textLink.contains(string)) {
			System.out.println("test ok");

		} else {
			System.out.println("test not  ok");

		}
		;
	}

}

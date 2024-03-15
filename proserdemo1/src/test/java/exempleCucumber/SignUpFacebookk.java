package exempleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpFacebookk {
	WebDriver driver;

	@Given("Access driver")

	public void access_driver() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Given("Access browser")
	public void access_browser() {
		driver.get("https://www.facebook.com/");

	}

	@When("I click signup button")
	public void i_click_signup_button() {
		WebElement CreateButton;
		CreateButton = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		CreateButton.click();

	}

	@When("I input firstname {string}")
	public void i_input_firstname(String string) {
		WebElement firstName;
		firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys(string);

	}

	@When("I input name  {string}")
	public void i_input_name(String string) {
		WebElement name;
		name = driver.findElement(By.name("lastname"));
		name.sendKeys(string);

	}

	@When("I input email  {string}")
	public void i_input_email(String string) {
		WebElement email;
		email = driver.findElement(By.name("reg_email__"));
		email.sendKeys(string);
	}

	@When("I input email verified {string}")
	public void i_input_email_verified(String string) {
		WebElement email, emailCopy;
		email = driver.findElement(By.name("reg_email__"));
		emailCopy = driver.findElement(By.name("reg_email_confirmation__"));
		Actions action = new Actions(driver);
		action.keyDown(email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(emailCopy, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

	@When("I input password {string}")
	public void i_input_password(String string) {
		WebElement password;
		password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys(string);
	}

	@When("I select day {string}")
	public void i_select_day(String string) {
		WebElement selectDay;
		selectDay = driver.findElement(By.id("day"));
		Select selectdays = new Select(selectDay);
		selectdays.selectByValue(string);
	}

	@When("I select month {string}")
	public void i_select_month(String string) {
		WebElement selectmonth;
		selectmonth = driver.findElement(By.id("month"));
		Select selectmonths = new Select(selectmonth);
		selectmonths.selectByValue(string);

	}

	@When("I select year {string}")
	public void i_select_year(String string) {
		WebElement selectYear;
		selectYear = driver.findElement(By.id("year"));
		Select selectYears = new Select(selectYear);
		selectYears.selectByValue(string);

	}

	@When("I select sex {string}")
	public void i_select_sex(String string) {
		WebElement man, women, special;

		if (string.equals("Homme")) {
			man = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
			man.click();
		} else if (string.equals("Homme")) {
			women = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
			women.click();
		} else if (string.equals("Personnalisé"))

		{
			special = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
			special.click();
		}
	}

	@When("click signup button")
	public void click_signup_button() {
		WebElement signUp;
		signUp = driver.findElement(By.name("websubmit"));
		signUp.click();

	}

	@Then("Facebook Acount created")
	public void facebook_acount_created() {
		String textUrl;
		textUrl = driver.getCurrentUrl();
		if (textUrl.contains("confirmemail")) {
			System.out.println("Account created ");
		} else {
			System.out.println("Account not  created ");
		}
	}
}

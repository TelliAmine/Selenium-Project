package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SignUpFacebbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// access to navigator
		WebDriver driver = new ChromeDriver();
		// Maximaze Window
		driver.manage().window().maximize();
		// wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// access to the website
		driver.get("https://www.facebook.com/");

		// Declaration
		WebElement CreateButton;
		CreateButton = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		// Action Click
		CreateButton.click();
		// identification boxes
		WebElement firstName, name, password, email, emailCopy, selectDay, selectmonth, selectYear, signUp, genre;
		firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Amine");
		name = driver.findElement(By.name("lastname"));
		name.sendKeys("Telli");
		email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("amine@gmail.com");
		// copier coller email
		emailCopy = driver.findElement(By.name("reg_email_confirmation__"));
		Actions action = new Actions(driver);
		action.keyDown(email, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(emailCopy, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		;
		// password
		password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("1234amine@");
		// Selectdays
		selectDay = driver.findElement(By.id("day"));
		Select selectdays = new Select(selectDay);
		selectdays.selectByValue("19");
		// Selectmonths
		selectmonth = driver.findElement(By.id("month"));
		Select selectmonths = new Select(selectmonth);
		selectmonths.selectByValue("6");
		// Selectyears
		selectYear = driver.findElement(By.id("year"));
		Select selectYears = new Select(selectYear);
		selectYears.selectByValue("1993");
		// genre select
		genre = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		genre.click();
		// SignUpButton
		signUp = driver.findElement(By.name("websubmit"));
		signUp.click();
		System.out.println("Test Ok");

	}

}

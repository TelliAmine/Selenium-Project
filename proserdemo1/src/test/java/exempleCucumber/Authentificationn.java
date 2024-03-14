package exempleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificationn {
	WebDriver driver;

	@Given("ouvrir le navigateur")
	public void ouvrir_le_navigateur() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();// Take action on browser
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("ouvrir Url")
	public void ouvrir_url() {
		// maximaze window

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("saisir username")
	public void saisir_username() {
		WebElement user;
		user = driver.findElement(By.name("username"));

		user.sendKeys("Admin");
	}

	@When("saisir mot de passe")
	public void saisir_mot_de_passe() {
		WebElement mdp;
		mdp = driver.findElement(By.name("password"));
		mdp.sendKeys("admin123");

	}

	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
		WebElement login;
		login = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		login.click();
	}

	@Then("verifier le nom de profil")
	public void verifier_le_nom_de_profil() {
		WebElement profile;
		profile = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profile.getText();
		Assert.assertEquals(text, "Bob Tester");

	}

}

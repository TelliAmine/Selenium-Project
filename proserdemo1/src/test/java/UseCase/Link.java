package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		// Maximaze Window
		driver.manage().window().maximize();
		// access to the website
		driver.get("https://www.google.com/");
		// wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// declaration
		WebElement Input;

		// identification
		Input = driver.findElement(By.name("q"));
		// Actions
		Input.sendKeys("Palestine");
		Input.sendKeys(Keys.ENTER);

		// Verification
		String url;
		url = driver.getCurrentUrl();
		// Assert.assertEquals(url,
		// "https://www.google.com/search?q=palestine&sca_esv=1114ab6409594670&source=hp&ei=NEnwZeTwIJXlxc8PleKamAE&iflsig=ANes7DEAAAAAZfBXRMJpVtwKb1PBJOCtNwZujk66qgrZ&gs_ssp=eJzj4tTP1TcwzDYoMDFg9OIsSMxJLS7JzEsFAEXcBsg&oq=Palest&gs_lp=Egdnd3Mtd2l6IgZQYWxlc3QqAggAMggQLhixAxiABDIIEAAYgAQYsQMyCBAAGIAEGLEDMggQLhiABBjUAjIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQLhiABEjoG1AAWNAMcAB4AJABAJgBmAKgAdUGqgEFMC41LjG4AQHIAQD4AQGYAgagAv4GwgILEAAYgAQYsQMYgwHCAg4QABiABBiKBRixAxiDAcICDhAuGIAEGLEDGMcBGNEDwgIIEC4YgAQYsQPCAhEQLhiABBjHARivARiYBRiZBcICCxAuGIAEGLEDGIMBwgIOEC4YgAQYigUYsQMYgwGYAwCSBwUwLjUuMaAH0D4&sclient=gws-wiz");
		if (url.contains("Palestine")) {
			System.out.println("Test Ok ");

		} else {
			System.out.println("we have bug  ");

		}

	}

}

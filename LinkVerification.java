package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkVerification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String verify = driver.findElement(By.xpath("//h1[contains(text(),'HTTP Status 404 – Not Found')]")).getText();
		if(verify.contains("404"))
		{
			System.out.println("Link is broken");
		} else
			System.out.println("Link is not broken");
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		driver.close();

	}

}

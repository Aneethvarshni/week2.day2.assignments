package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageVerification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img")).isEnabled());
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img")).click();
		driver.navigate().back();
		driver.close();

	}

}

package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageVerification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img")).getText();
		String loadURL = driver.findElement(By.xpath("//img[@src=\"../images/abcd.jpg\"]")).getAttribute("src");
		driver.get(loadURL);
		String verify = driver.findElement(By.xpath("/html/body/h1")).getText();
		if (verify.contains("404")) {
			System.out.println("Image is broken");
		} else
			System.out.println("Image is not broken");
		driver.navigate().to("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img")).click();
		driver.navigate().back();
		driver.close();

	}

}

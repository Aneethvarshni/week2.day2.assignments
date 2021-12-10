package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
 public static void main(String[] args)
 {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver  driver =  new ChromeDriver();
	 driver.get("https://en-gb.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anu0120");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pons0192");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number or email address')]/following-sibling::input")).sendKeys("9080930717");
		driver.findElement(By.xpath("//div[contains(text(),'New password')]/following-sibling::input")).sendKeys("Password0120@@");
		WebElement element = driver.findElement(By.id("day"));
		Select dateDropDown = new Select(element);
		dateDropDown.selectByVisibleText("20");
		WebElement element1 = driver.findElement(By.id("month"));
		Select monthDropDown = new Select(element1);
		monthDropDown.selectByVisibleText("Jun");
		WebElement element2 = driver.findElement(By.id("year"));
		Select yearDropDown = new Select(element2);
		yearDropDown.selectByValue("1990");
		WebElement radioBtn = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		radioBtn.click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.close();
 }
}
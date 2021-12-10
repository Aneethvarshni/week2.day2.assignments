package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownVerification {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select select1 = new Select(drop1);
		select1.selectByIndex(1);

		WebElement drop2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(drop2);
		select2.selectByVisibleText("Appium");

		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(drop3);
		select3.selectByValue("3");

		WebElement drop4 = driver.findElement(By.className("dropdown"));
		Select select4 = new Select(drop4);
		select4.getOptions();

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
		
		WebElement drop5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select5 = new Select(drop5);
		select5.selectByVisibleText("Loadrunner");
		driver.close();

	}

}

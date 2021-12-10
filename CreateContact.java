package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Aneethvarshni");
		driver.findElement(By.id("lastNameField")).sendKeys("Ponmudi");
		driver.findElement(By.name("firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.name("lastNameLocal")).sendKeys("Pons");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Creating a new contact");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("abc@gmail.com");
		WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select = new Select(element);
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updating the create contact page");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titleName = driver.getTitle();
		System.out.println(titleName);
		driver.close();

	}

}

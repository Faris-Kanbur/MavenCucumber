package StepDefinitons;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SFAccountCreation {

	WebDriver driver;
	
	@Given("^Oepn SF application acccount creation page$")
	public void oepn_sf_application_acccount_creation_page() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	}

	@When("^User Enter all the details$")
	public void user_enter_all_the_details(DataTable data) throws Throwable {
		Thread.sleep(3000);
		// 1-asLists: is used to pull the data from the feature fill and store it in
		// list of strings in current step
		List<List<String>> values = data.asLists();
		System.out.println(values.get(0).get(0));

		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys(values.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys(values.get(0).get(1));
		driver.findElement(By.xpath("//input[@name='UserTitle']")).sendKeys(values.get(0).get(2));
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys(values.get(0).get(3));
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys(values.get(0).get(4));

		WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(values.get(0).get(5));
		
		Thread.sleep(2000);

		WebElement staticDropdownCountry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropdown2 = new Select(staticDropdownCountry);
		dropdown2.selectByVisibleText(values.get(0).get(6 ));
		Thread.sleep(2000);

	}
	
    @When("^User Enter (.+), (.+),(.+),(.+),(.+),(.+),(.+) these details$")
    public void user_enter_these_details(String firstname, String lastname, String title, String mail, String telno, String companyname, String country) throws Throwable {
    	driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='UserTitle']")).sendKeys(title);
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys(mail);
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys(telno);

		WebElement staticDropdown = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);

		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(companyname);
		
		Thread.sleep(2000);

		WebElement staticDropdownCountry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropdown2 = new Select(staticDropdownCountry);
		dropdown2.selectByVisibleText(country);
		Thread.sleep(2000);
    }
       

	@Then("^clcik on signup button$")
	public void clcik_on_signup_button() throws Throwable {
		Thread.sleep(2000);
		
		System.out.println("Bura========================");
		 
		driver.findElement(By.cssSelector("div[class='checkbox-ui']")).click();
		System.out.println("aaaaa========================");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}

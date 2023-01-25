package StepDefinitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SFLoginPage {

	WebDriver driver;
	
    @Given("^Accessing SF application using \"([^\"]*)\"$")
    public void accessing_sf_application_using_something(String url) throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
   
    	
	
    @When("^User Enter username as \"([^\"]*)\", password as \"([^\"]*)\" and click on login button$")
    public void user_enter_username_as_something_password_as_something_and_click_on_login_button(String username, String password) throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
    
    }
	


//	@When("User Enter username, password and click on login button")
//	public void user_enter_username_password_and_click_on_login_button() throws InterruptedException {
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("faris35kanbur-a7be@force.com");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Faris5016??");
//		driver.findElement(By.id("Login")).click();
//	}




	@Then("^verify the logout button$")
	public void verify_the_logout_button() throws Throwable {
		Thread.sleep(5000);
		boolean objInfo = driver.findElement(By.xpath("//span[@class='uiImage'])[1]")).isDisplayed();
		if(objInfo) {
			System.out.println("Logout Link git displayed, succesfully logged in");
		}else {
			System.out.println("Logout Link git not displayed, succesfully logged failed");

		}

		driver.findElement(By.xpath("//span[@class='uiImage'])[1]")).click();

		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		

	}
	
    @Then("^verify login page$")
    public void verify_login_page() throws Throwable {

    	boolean logoIn = driver.findElement(By.xpath("//input[@id='username']")).isDisplayed();
		if(logoIn) {
			System.out.println("On Login Page still");
		}else {
			System.out.println("Succesfully logged in");

		}
    }

}

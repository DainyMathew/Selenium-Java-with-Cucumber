package StepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStepPOM {

   WebDriver driver=null;
   LoginPage login;
   HomePage home;
   
	
   @Before
	public void browserSetup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		//driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
	}
	
	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   driver.navigate().to("https://example.testproject.io/web/");
	}

	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException  {
		login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		Thread.sleep(2000);
		
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		
		
	}

	
	@When("click on login button")
	public void click_on_login_button() {
		login.click_login();
		//driver.findElement(By.id("login")).click();
	}

	
	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		home=new HomePage(driver);
		home.logout_displayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		
	}
;

}

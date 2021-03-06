//package StepDefinition;
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class LoginStep {
//
//   WebDriver driver=null;
//   
//	@Given("^browser is open$")
//	public void browser_is_open() {
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	
//		
//		//driver = new ChromeDriver();
//		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//		
//	}
//	
//	
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	   driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password)  {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		
//	}
//
//	
//	@When("click on login button")
//	public void click_on_login_button() {
//		driver.findElement(By.id("login")).click();
//	}
//
//	
//	@Then("User is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//		driver.findElement(By.id("login")).isDisplayed();
//		driver.close();
//		driver.quit();
//	}
//
//
//}

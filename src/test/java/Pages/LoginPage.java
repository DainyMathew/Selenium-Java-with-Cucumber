package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver driver;

	@FindBy (id="name")
	WebElement txt_username;
	
	@FindBy (id="password")
	WebElement txt_password;
	
	@FindBy (id="login")
	WebElement btn_login;
	
	@FindBy (id="logout")
	WebElement btn_logout;
			
//	By txt_password =By.id("password");
//	By btn_login =By.id("login");
//	By btn_logout=By.id("logout");
	
	
	public LoginPage(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	}
	
	
	public void enter_username(String username) {
		txt_username.sendKeys(username);
		
	}
	
	
	public void enter_password(String password) {
		txt_password.sendKeys(password);
		
	}
	
	public void click_login (){
		btn_login.click();
		
	}
	
	
	
	public void loginvaliduser(String username,String password) {
		txt_username.sendKeys(username);
	    txt_password.sendKeys(password);
		btn_login.click();
	}
	
}
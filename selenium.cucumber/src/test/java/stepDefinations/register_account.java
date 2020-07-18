package stepDefinations;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.selenium.pom.ComposeEmail;
import com.selenium.pom.Signup;
import com.selenium.pom.ValidateEmail;
import com.selenium.util.DriverFactory;
import com.selenium.util.DriverNames;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class register_account {

	public Signup signup;
	public WebDriver driver;
	public ValidateEmail validateemail;
	public ComposeEmail composeemail;


	public  register_account() {
		this.driver = DriverFactory.getDriver(DriverNames.CHROME); 
		signup = new Signup(driver);
		validateemail=new ValidateEmail(driver);
		composeemail=new ComposeEmail(driver);
		
	}




	@Given("User is on HomePage")
	public void user_is_on_home_page() {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\BHANUSANGARAJU\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		//driver=new ChromeDriver();		
		driver.get("http://elearningm1.upskills.in/index.php");


	}

	@When("SignUp Button is available click on it")
	public void sign_up_button_is_available_click_on_it() {
		
		signup.signup().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Then("Enter all mandatory fields and click on Register button")
	public void enter_all_mandatory_fields_and_click_on_register_button(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class); 
		
		/*
		 
		System.out.println(list.get(0).get("firstname"));
		System.out.println(list.get(0).get("lastname"));
		System.out.println(list.get(0).get("email"));
		System.out.println(list.get(0).get("username"));
		System.out.println(list.get(0).get("password"));
		System.out.println(list.get(0).get("confirmpassword"));
		System.out.println(list.get(0).get("phone"));
    */
		signup.firstname().clear();
		signup.firstname().sendKeys(list.get(0).get("firstname"));

		signup.lastname().clear();
		signup.lastname().sendKeys(list.get(0).get("lastname"));

		signup.email().clear();
		signup.email().sendKeys(list.get(0).get("email"));

		signup.username().clear();
		signup.username().sendKeys(list.get(0).get("username"));

		signup.password().clear();
		signup.password().sendKeys(list.get(0).get("password"));

		signup.confirmpasword().clear();
		signup.confirmpasword().sendKeys(list.get(0).get("confirmpassword"));

		signup.phone().clear();
		signup.phone().sendKeys(list.get(0).get("phone"));

		signup.register().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}

	@And("validate message Your personal settings have been registered on next page")
	public void validate_message_your_personal_settings_have_been_registered_on_next_page() {
		
		
		System.out.println(signup.confirmation_message().getText());

	}
	
	@Then("User clicks top right corner")
	public void user_clicks_top_right_corner() {
	    validateemail.dropdown().click();
	}

	@When("Dropdown is shown")
	public void dropdown_is_shown() {
		
		System.out.println("User Drop down to validate Emailid is Shown");
	    
	}

	@Then("validate the email which is entered")
	public void validate_the_email_which_is_entered(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class); 
		
		String original_email=list.get(0).get("send_email");
		
		String user_email=validateemail.validate_email().getText();
		
		System.out.println("Email ID sent by user during Registration is "+ original_email);
		System.out.println("Email ID Registered on Website is "+ user_email);
		
		if(original_email.equals(user_email)) {
			System.out.println("Both User Email and Registered Email are same");
		}
		else {
			System.out.println("Both User Email and Registered Email are not same");
		}
	
	   
	}

	@And("Click on Compose on HomePage and Enter Message and click on send Message")
	public void click_on_compose_on_home_page_and_enter_message_and_click_on_send_message(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class); 
		
		composeemail.homepage().click();
		composeemail.compose_email().click();
		
		composeemail.sendto().clear();
		composeemail.sendto().sendKeys(list.get(0).get("sendto"));
		
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		composeemail.sendto().sendKeys(Keys.ARROW_DOWN);
		composeemail.sendto().sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		composeemail.subject().clear();
		composeemail.subject().sendKeys(list.get(0).get("subject"));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//composeemail.message().click();		
		//composeemail.message().sendKeys(list.get(0).get("message"));
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		composeemail.description().clear();
		composeemail.description().sendKeys(list.get(0).get("description"));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		composeemail.send_message().click();
		
		
	}

	@Then("Validate Message Sent Acknowledgement")
	public void validate_message_sent_acknowledgement() {
		
		String ack = composeemail.acknowledgement().getText();
		
			
		System.out.println("Acknowledgement received after mail sent is "+ ack);
		driver.quit();
	    
	}

}

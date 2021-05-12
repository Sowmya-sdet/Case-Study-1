package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

	WebDriver driver;
		@Given("I should be able to enter all details for the Login page")
		public void i_am_able_to_navigate_onto_the_login_page() {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOWMYAPRASAD\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			    //this is to open the new instance of browser
			    driver = new ChromeDriver();
			    //this is basically to open the application
			    driver.get("http://elearningm1.upskills.in/");
			    //max the screen
			    driver.manage().window().maximize();
			    //if i want to wait
			    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		
		@When("I click on the sign up button")
		public void i_click_on_the_sign_up_button() {
			driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
			//driver.findElement(By.id("btnLogin")).click(); 
		}
		@When("I enter the firstname as {string}")
		public void i_enter_the_firstname_as(String string) {
		    driver.findElement(By.id("registration_firstname")).sendKeys("Sowmya");
		}
		@When("I enter the lastname as {string}")
		public void i_enter_the_lastname_as(String string) {
			 driver.findElement(By.id("registration_lastname")).sendKeys("Prasad");
		}
		@When("I enter the e-mail as {string}")
		public void i_enter_the_e_mail_as(String string) {
			 driver.findElement(By.id("registration_email")).sendKeys("sowmyap190@gmail.com");
		}
		@When("I enter the username as {string}")
		public void i_enter_the_username_as(String string) {
			driver.findElement(By.id("username")).sendKeys("sowmyap190");
		}
		@When("I enter the password as {string}")
		public void i_enter_the_password_as(String string) {
		   driver.findElement(By.id("pass1")).sendKeys("sowmyap190");
		}
		
		@When("I enter the confirmpassword as {string}")
		public void i_enter_the_confirmpassword_as(String string) {
		   driver.findElement(By.id("pass2")).sendKeys("sowmyap190");
		}
		
		@When("I click on the registration button")
		public void i_click_on_the_registration_button() {
		    driver.findElement(By.id("registration_submit")).click();
		    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
		@When("I click on the picture button")
		public void i_click_on_the_picture_button() {
		    driver.findElement(By.xpath("(//img[@class='img-circle'])[1]")).click();
		}
		
		@When("I click on the inbox button")
		public void i_click_on_the_inbox_button() {
		   driver.findElement(By.xpath("//a[@title='Inbox']")).click();
		}
		
		@When("I click on the compose button")
		public void i_click_on_the_compose_button() {
			driver.findElement(By.xpath("//img[@alt='Compose message']")).click();
		    
		}
		
		@When("I click on sendto as {string}")
		public void i_click_on_sendto_as(String string) throws InterruptedException {
			WebElement textbox= driver.findElement(By.cssSelector("input.select2-search__field"));
			textbox.sendKeys("sowmyap1234@gmail.com");
			Thread.sleep(5000);
			//textbox.submit();
			textbox.sendKeys(Keys.ENTER);
		}
		
		@When("I enter the subject as {string}")
		public void i_enter_the_subject_as(String string) throws InterruptedException {
			WebElement textbox= driver.findElement(By.id("compose_message_title"));
			textbox.sendKeys("Hi For Testing");
			Thread.sleep(5000);
			// textbox.sendKeys(Keys.TAB);
		}
		
		// @When("I enter the body as {string}")
		// public void i_enter_the_body_as(String string)  {
		// WebElement textbox= driver.findElement(By.id("compose_message_body"));
		// textbox.sendKeys("Hello Ms Sowmya This is for Testing From, Sowmya");
		// }
		
		@When("I click on the Send Message button")
		public void i_click_on_the_send_message_button() {
			driver.findElement(By.id("compose_message_compose")).click();
		}
		@Then("I should see the acknowledgement window as {string}")
		public void i_should_see_the_acknowledgement_window_as(String string) {
			 //String name = driver.findElement(By.xpath(".//form[@class='alert alert-success'")).getText();
			String name = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
			    String Actualdata = "The message has been sent to Sowmya Prasad (sowmyap1234)";
			    Assert.assertEquals(name,Actualdata);
			    System.out.println("The message has been sent to Sowmya Prasad (sowmyap1234)");	
			    // driver.close();
		}

}

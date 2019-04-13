package steps;


import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmptyForm extends Home{


	@Given("The user is in the add customer page")
	public void the_user_is_in_the_add_customer_page() {
	   getId();
	    loadUrl("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see the alert message")
	public void the_user_should_see_the_alert_message() {
	    Alert al=driver.switchTo().alert();
	    String text = al.getText();
	    Assert.assertEquals(text,"please fill all fields");
	    }


}

package steps;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmptyForm1 extends Home{
	@Given("The user is in the add tariff plan")
	public void the_user_is_in_the_add_tariff_plan() {
		getId();
	    loadUrl("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("the user clicks the Submit Button")
	public void the_user_clicks_the_Submit_Button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("the user should see the Alert message")
	public void the_user_should_see_the_Alert_message() {
	    Alert al=driver.switchTo().alert();
	    String text1 = al.getText();
	    Assert.assertEquals(text1,"please fill all fields Correct Value");
	}
	

}

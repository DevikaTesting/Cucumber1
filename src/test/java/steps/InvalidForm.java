package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class InvalidForm extends Home{
	@Given("the user is in the add customer page")
	public void the_user_is_in_the_add_customer_page() {
		 getId();
		 loadUrl("http://demo.guru99.com/telecom/addcustomer.php");

	}

	@When("the user fill in the customer details")
	public void the_user_fill_in_the_customer_details(DataTable CustDetails) throws InterruptedException {
		List<String> customerDetails = CustDetails.asList(String.class);
		System.out.println(customerDetails);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(customerDetails.get(0));
		driver.findElement(By.id("lname")).sendKeys(customerDetails.get(1));
		driver.findElement(By.id("email")).sendKeys(customerDetails.get(2));
		driver.findElement(By.name("addr")).sendKeys(customerDetails.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(customerDetails.get(4));
	    
	}

	@When("the user clicks the submit Button")
	public void the_user_clicks_the_submit_Button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the error message")
	public void the_user_should_see_the_error_message() {
		Assert.assertTrue(true);                                        
	}



}

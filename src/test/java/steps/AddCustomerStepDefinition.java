package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerStepDefinition extends Home {
	
	
	@Given("The user is in add customer Page")
	public void the_user_is_in_add_customer_Page() {
		getId();
	    loadUrl("http://demo.guru99.com/telecom/addcustomer.php");
	}



	@When("The user fill in the customer details")
	public void the_user_fill_in_the_customer_details(DataTable customerlist) throws InterruptedException {
		List<String> customerDetails = customerlist.asList(String.class);
		System.out.println(customerDetails);
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(customerDetails.get(0));
		driver.findElement(By.id("lname")).sendKeys(customerDetails.get(1));
		driver.findElement(By.id("email")).sendKeys(customerDetails.get(2));
		driver.findElement(By.name("addr")).sendKeys(customerDetails.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(customerDetails.get(4));
	    
	}

	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	driver.findElement(By.name("submit")).click();
	}
	
	@Then("The user should see the customer Id")
	public void the_user_should_see_the_customer_Id() {
		Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}

	
	



}

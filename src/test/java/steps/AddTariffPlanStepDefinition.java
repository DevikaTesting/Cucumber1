package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddTariffPlanStepDefinition extends Home{
	@Given("The user is in the add tariff plan page")
	public void the_user_is_in_the_add_tariff_plan_page() {
	    getId();
	    loadUrl("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("The user fill in the tariff details")
	public void the_user_fill_in_the_tariff_details(DataTable cust) {
	    List<String>CustDetails=cust.asList(String.class);
	    System.out.println(CustDetails);
	    driver.findElement(By.id("rental1")).sendKeys(CustDetails.get(0));
	    driver.findElement(By.id("local_minutes")).sendKeys(CustDetails.get(1));
	    driver.findElement(By.id("inter_minutes")).sendKeys(CustDetails.get(2));
	    driver.findElement(By.id("sms_pack")).sendKeys(CustDetails.get(3));
	    driver.findElement(By.id("minutes_charges")).sendKeys(CustDetails.get(4));
	    driver.findElement(By.id("inter_charges")).sendKeys(CustDetails.get(5));
	    driver.findElement(By.id("sms_charges")).sendKeys(CustDetails.get(6));
	}

	@When("The user clicks the submit Button")
	public void the_user_clicks_the_submit_Button() {
		driver.findElement(By.name("submit")).click();

	}
	
	@Then("The user should see the success meassage")
	public void the_user_should_see_the_success_meassage() {
		Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
	}


}

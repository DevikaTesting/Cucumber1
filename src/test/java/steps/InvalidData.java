package steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class InvalidData extends Home{
	@Given("the user is in the add tariff plan")
	public void the_user_is_in_the_add_tariff_plan() {
	getId();
	loadUrl("http://demo.guru99.com/telecom/addtariffplans.php");
	}

	@When("the user fill in the details")
	public void the_user_fill_in_the_details(DataTable CustList) {
		List<String>CustDetails1=CustList.asList(String.class);
	    System.out.println(CustDetails1);
	    driver.findElement(By.id("rental1")).sendKeys(CustDetails1.get(0));
	    driver.findElement(By.id("local_minutes")).sendKeys(CustDetails1.get(1));
	    driver.findElement(By.id("inter_minutes")).sendKeys(CustDetails1.get(2));
	    driver.findElement(By.id("sms_pack")).sendKeys(CustDetails1.get(3));
	    driver.findElement(By.id("minutes_charges")).sendKeys(CustDetails1.get(4));
	    driver.findElement(By.id("inter_charges")).sendKeys(CustDetails1.get(5));
	    driver.findElement(By.id("sms_charges")).sendKeys(CustDetails1.get(6));
	}

	@When("the user clicks the Submitt Button")
	public void the_user_clicks_the_Submitt_Button() {
		driver.findElement(By.name("submit")).click();
	}

	@Then("The user should see the Error message")
	public void the_user_should_see_the_Error_message() {
		Alert al=driver.switchTo().alert();
		String text1 = al.getText();
		Assert.assertEquals(text1,"please fill all fields Correct Value");
	    
	}



}

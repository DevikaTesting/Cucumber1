package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.Home;

public class AddTariffPage {
	public AddTariffPage() {
		PageFactory.initElements(Home.driver, this);
	}
	@FindBy(id="rental1")
	private WebElement rent;
	
	@FindBy(id="local_minutes")
	private WebElement local;
	
	@FindBy(id="inter_minutes")
	private WebElement inter;
	
	@FindBy(id="sms_pack")
	private WebElement sms;
	
	@FindBy(id="minutes_charges")
	private WebElement minutes;
	
	@FindBy(id="inter_charges")
	private WebElement inter1;
	
	@FindBy(id="sms_charges")
	private WebElement sms1;

	public WebElement getRent() {
		return rent;
	}

	public void setRent(WebElement rent) {
		this.rent = rent;
	}

	public WebElement getLocal() {
		return local;
	}

	public void setLocal(WebElement local) {
		this.local = local;
	}

	public WebElement getInter() {
		return inter;
	}

	public void setInter(WebElement inter) {
		this.inter = inter;
	}

	public WebElement getSms() {
		return sms;
	}

	public void setSms(WebElement sms) {
		this.sms = sms;
	}

	public WebElement getMinutes() {
		return minutes;
	}

	public void setMinutes(WebElement minutes) {
		this.minutes = minutes;
	}

	public WebElement getInter1() {
		return inter1;
	}

	public void setInter1(WebElement inter1) {
		this.inter1 = inter1;
	}

	public WebElement getSms1() {
		return sms1;
	}

	public void setSms1(WebElement sms1) {
		this.sms1 = sms1;
	}
}

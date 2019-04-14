package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.Home;

public class AddCustomerPage {
	public AddCustomerPage(){ 
		PageFactory.initElements(Home.driver, this);
		}
@FindBy(xpath="//label[text()='Done']")
private WebElement cl;

@FindBy(id="fname")
private WebElement fn;

@FindBy(id="lname")
private WebElement ln;

@FindBy(id="email")
private WebElement em;

@FindBy(id="addr")
private WebElement add;

@FindBy(id="telephoneno")
private WebElement ph;

public WebElement getCl() {
	return cl;
}

public void setCl(WebElement cl) {
	this.cl = cl;
}

public WebElement getFn() {
	return fn;
}

public void setFn(WebElement fn) {
	this.fn = fn;
}

public WebElement getLn() {
	return ln;
}

public void setLn(WebElement ln) {
	this.ln = ln;
}

public WebElement getEm() {
	return em;
}

public void setEm(WebElement em) {
	this.em = em;
}

public WebElement getAdd() {
	return add;
}

public void setAdd(WebElement add) {
	this.add = add;
}

public WebElement getPh() {
	return ph;
}

public void setPh(WebElement ph) {
	this.ph = ph;
}



}
